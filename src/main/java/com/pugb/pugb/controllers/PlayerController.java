package com.pugb.pugb.controllers;

import org.apache.tomcat.util.codec.binary.Base64;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.pugb.pugb.controllers.request.ErrorsResquest;

@RestController
public class PlayerController {

	@RequestMapping(value = "/player/testapi", method = RequestMethod.GET)
	public @ResponseBody Object getTest() {
		RestTemplate rest = new RestTemplate();
		// PlayerRequest s = null;
		ErrorsResquest errors = null;
		try {

			String plainCreds = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2ZDllODNiMC02MDA2LTAxMzYtMDFhOC0wNTk3MzUyNmNmMzIiLCJpc3MiOiJnYW1lbG9ja2VyIiwiaWF0IjoxNTMwNTIyOTQ2LCJwdWIiOiJibHVlaG9sZSIsInRpdGxlIjoicHViZyIsImFwcCI6InB1Ymctc3RhdHMtZGFzaGJvYXJkIn0.KbhLD81VWCVAytGKVDY9CbYaeUdk_AP3-vbuUdDx2ZE";
			byte[] plainCredsBytes = plainCreds.getBytes();
			byte[] base64CredsBytes = Base64.encodeBase64(plainCredsBytes);
			String base64Creds = new String(base64CredsBytes);

			HttpHeaders headers = new HttpHeaders();
			headers.add("Authorization", "Basic " + base64Creds);

			HttpEntity<String> httpEntity = new HttpEntity<String>(headers);
//https://api.pubg.com/shards/pc-eu/players?filter[playerNames]=KresniK87
			Object object = rest.exchange("https://api.pubg.com/shards/pc-eu/players/67687", HttpMethod.GET, httpEntity,
					Object.class).getBody();
			errors = new ErrorsResquest();
			// return supervisorService.addStudent(s);
			// return new
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return new ResponseEntity<>(HttpStatus.SERVICE_UNAVAILABLE);
		}
		return errors;
	}
	

}
