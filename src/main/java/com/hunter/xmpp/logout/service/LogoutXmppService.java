package com.hunter.xmpp.logout.service;

import static com.hunter.xmpp.logout.util.Util.ERROR_RESPONSE;
import static com.hunter.xmpp.logout.util.Util.OK_RESPONSE;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.hunter.xmpp.logout.model.RestParams;

/**
 * @author Fredi Hernandez
 *
 */
@Service
public class LogoutXmppService {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private RestParams restParams;

	public String logout(String username) {
		ResponseEntity<String> response;
		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		headers.set("Authorization", restParams.getSecretKey());

		HttpEntity<String> entity = new HttpEntity<String>(headers);
		response = restTemplate.exchange(restParams.getHost() + restParams.getUserSessions() + username, HttpMethod.DELETE, entity, String.class);

		if (response.getStatusCode().is2xxSuccessful()) {
			return OK_RESPONSE;
		}
		return ERROR_RESPONSE;
	}

}
