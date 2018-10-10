package com.pugb.pugb.controllers;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.security.oauth2.client.authentication.OAuth2AuthenticationToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pugb.pugb.controllers.request.SeasonRequest;

@RestController
public class SeasonController {

	@RequestMapping(value = "/seasons", method = RequestMethod.GET)
	public @ResponseBody SeasonRequest getSeasons(OAuth2AuthenticationToken authentication) {
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
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return null;
		}
		
		return sr;
	}
}
