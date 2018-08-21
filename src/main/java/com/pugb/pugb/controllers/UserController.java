package com.pugb.pugb.controllers;

import static org.mockito.Mockito.RETURNS_DEEP_STUBS;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import javax.mail.Header;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ResolvableType;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
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
<<<<<<< HEAD
=======
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
>>>>>>> refs/heads/domain
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

<<<<<<< HEAD
=======
import com.pugb.pugb.controllers.request.UserRequest;
import com.pugb.pugb.domain.User;
>>>>>>> refs/heads/domain
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

<<<<<<< HEAD
        return "loginSuccess";
    }
    
    @GetMapping("/loginSuccess")
=======
		return "loginSuccess";
	}

	@GetMapping("/")
>>>>>>> refs/heads/domain
    public @ResponseBody String main(Model model, OAuth2AuthenticationToken authentication) {
    	String email = authentication.getPrincipal().getAttributes().get("email").toString();
    	UserPlayerDto user = userService.login(email);
    	
    	return "Welcome: " + user.getUserEmail();
    }
    
    @GetMapping("/player")
    public Boolean findPlayer(@RequestParam String server, @RequestParam String nickName) {
    	RestTemplate rest = new RestTemplate();
		try {
		String plainCreds = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhMmU0YTgzMC04MjFiLTAxMzYtY2UxOC00NzMxZjhiNTM3OGMiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTM0MjcwMzk1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImtleS1wdWJnc3RhdHMifQ.gIhjTVeS6TvLzFseIwA1Gm_teq0Hu2n0idv1iRfi16g";
		
//		byte[] plainCredsBytes = plainCreds.getBytes();
//		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
//		String base64Creds = new String(base64CredsBytes);

		HttpHeaders headers = new HttpHeaders();
		headers.add("Accept", "application/vnd.api+json");
		headers.add("Authorization", plainCreds);
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.add("Authorization", "Basic " + base64Creds);

		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
		
		Object object = rest
				.exchange("https://api.pubg.com/shards/"+ server +"/players?playerNames=" + nickName, HttpMethod.GET, httpEntity, Object.class)
				.getBody();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
    }

	// https://api.pubg.com/shards/pc-eu/players?filter[playerNames]=KresniK87

	@RequestMapping(value = "/player/find", method = RequestMethod.GET)
	public Boolean findPlayer(@RequestParam String server, @RequestParam String nickName) {
		RestTemplate rest = new RestTemplate();
		try {
		String plainCreds = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhMmU0YTgzMC04MjFiLTAxMzYtY2UxOC00NzMxZjhiNTM3OGMiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTM0MjcwMzk1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImtleS1wdWJnc3RhdHMifQ.gIhjTVeS6TvLzFseIwA1Gm_teq0Hu2n0idv1iRfi16g";
		                   //eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhMmU0YTgzMC04MjFiLTAxMzYtY2UxOC00NzMxZjhiNTM3OGMiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTM0MjcwMzk1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImtleS1wdWJnc3RhdHMifQ.gIhjTVeS6TvLzFseIwA1Gm_teq0Hu2n0idv1iRfi16g
//		byte[] plainCredsBytes = plainCreds.getBytes();
//		byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
//		String base64Creds = new String(base64CredsBytes);
//let headers= new Header();
		
		HttpHeaders headers = new HttpHeaders();
		//headers.set;append('Content-Type', 'application/json');
//		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
//    	headers.setContentType(MediaType.APPLICATION_JSON);
//		headers.add("Authorization", "Basic " + base64Creds);

		HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
		
		Object object = rest
				.exchange("https://api.pubg.com/shards/pc-eu/players?playerNames=" + nickName, HttpMethod.GET, httpEntity, Object.class)
				.getBody();
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return false;
		}
		return true;
	}

}
