package com.pugb.pugb.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import com.pugb.pugb.controllers.request.SeasonRequest;
import com.pugb.pugb.services.season.service.SeasonService;
import com.pugb.pugb.services.user.dto.UserPlayerDto;
import com.pugb.pugb.services.user.service.UserService;

@Controller
public class UserController {

	private static final String authorizationRequestBaseUri = "oauth2/authorize-client";
	Map<String, String> oauth2AuthenticationUrls = new HashMap<>();

	@Autowired
	private ClientRegistrationRepository clientRegistrationRepository;
	@Autowired
	private OAuth2AuthorizedClientService authorizedClientService;

	@Autowired
	private UserService userService;
	
	@Autowired
	private SeasonService seasonService;

	@SuppressWarnings("unchecked")
	@GetMapping("/oauth_login")
	public String getLoginPage(Model model) {
		Iterable<ClientRegistration> clientRegistrations = null;
		ResolvableType type = ResolvableType.forInstance(clientRegistrationRepository).as(Iterable.class);
		if (type != ResolvableType.NONE && ClientRegistration.class.isAssignableFrom(type.resolveGenerics()[0])) {
			clientRegistrations = (Iterable<ClientRegistration>) clientRegistrationRepository;
		}

		clientRegistrations.forEach(registration -> oauth2AuthenticationUrls.put(registration.getClientName(),
				authorizationRequestBaseUri + "/" + registration.getRegistrationId()));
		model.addAttribute("urls", oauth2AuthenticationUrls);

		return "oauth_login";
	}

	@GetMapping("/loginSuccess")
	public String getLoginInfo(Model model, OAuth2AuthenticationToken authentication) {

		OAuth2AuthorizedClient client = authorizedClientService
				.loadAuthorizedClient(authentication.getAuthorizedClientRegistrationId(), authentication.getName());

		String userInfoEndpointUri = client.getClientRegistration().getProviderDetails().getUserInfoEndpoint().getUri();

		if (!StringUtils.isEmpty(userInfoEndpointUri)) {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.add(HttpHeaders.AUTHORIZATION, "Bearer " + client.getAccessToken().getTokenValue());

			HttpEntity<String> entity = new HttpEntity<String>("", headers);

			ResponseEntity<Map> response = restTemplate.exchange(userInfoEndpointUri, HttpMethod.GET, entity,
					Map.class);
			Map userAttributes = response.getBody();
			model.addAttribute("name", userAttributes.get("name"));
		}

		return "loginSuccess";
	}

	@GetMapping("/")
	public @ResponseBody UserPlayerDto main(OAuth2AuthenticationToken authentication) {
		
		// url for get all seasons
		RestTemplate rest = new RestTemplate();
		SeasonRequest sr = null;
		try {
			String plainCreds = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhMmU0YTgzMC04MjFiLTAxMzYtY2UxOC00NzMxZjhiNTM3OGMiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTM0MjcwMzk1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImtleS1wdWJnc3RhdHMifQ.gIhjTVeS6TvLzFseIwA1Gm_teq0Hu2n0idv1iRfi16g";

			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", "application/vnd.api+json");
			headers.add("Authorization", plainCreds);

			HttpEntity<String> httpEntity = new HttpEntity<String>(headers);

			String url = "https://api.pubg.com/shards/pc-eu/seasons";

			sr = rest.exchange(url, HttpMethod.GET, httpEntity, SeasonRequest.class).getBody();
			
			int seasons = seasonService.getSeasonsCount();
			
			if(seasons != sr.getData().length) {
				seasonService.UpdateSeason();
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		boolean season = seasonService.UpdateSeason();
		
		String email = authentication.getPrincipal().getAttributes().get("email").toString();
		UserPlayerDto user = userService.login(email);

		return user;
	}
	
	@GetMapping("/allusers")
	public @ResponseBody List<UserPlayerDto> allUsers(){
		return userService.getAllUsers();
	}


}