package com.pugb.pugb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pugb.pugb.controllers.request.PlayerRequest;
import com.pugb.pugb.controllers.request.PlayerSeasonRequest;
import com.pugb.pugb.services.user.service.UserService;

@RestController
public class PlayerController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/findplayer", method = RequestMethod.GET)
	public @ResponseBody PlayerRequest player(@RequestParam String shardId, @RequestParam String nickName, OAuth2AuthenticationToken authentication) {
		RestTemplate rest = new RestTemplate();
		PlayerRequest pr = null;

		try {
			String plainCreds = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiJhMmU0YTgzMC04MjFiLTAxMzYtY2UxOC00NzMxZjhiNTM3OGMiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTM0MjcwMzk1LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6ImtleS1wdWJnc3RhdHMifQ.gIhjTVeS6TvLzFseIwA1Gm_teq0Hu2n0idv1iRfi16g";

			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", "application/vnd.api+json");
			headers.add("Authorization", plainCreds);

			HttpEntity<String> httpEntity = new HttpEntity<String>(headers);

			MultiValueMap<String, String> uriVariables = new LinkedMultiValueMap<>();
			uriVariables.add("filter[playerNames]", nickName);

			String url = "https://api.pubg.com/shards/"+ shardId +"/players?filter[playerNames]=" + nickName;

			pr = rest.exchange(url, HttpMethod.GET, httpEntity, PlayerRequest.class).getBody();
			
			String email = authentication.getPrincipal().getAttributes().get("email").toString();
			if(!userService.addPlayer(nickName, shardId, email)) {
				return null;
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		return pr;
	}
	
	@GetMapping(value = "/player/season")
	public @ResponseBody PlayerSeasonRequest playerSeason(@RequestParam String playerId, OAuth2AuthenticationToken authentication) {
		
	}

}
