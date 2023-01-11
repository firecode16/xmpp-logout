package com.hunter.xmpp.logout.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.hunter.xmpp.logout.response.LogoutResponse;
import com.hunter.xmpp.logout.service.LogoutXmppService;

/**
 * @author Fredi Hernandez
 *
 */
@RestController
public class LogoutXmppController {

	@Autowired
	private LogoutXmppService service;

	@CrossOrigin
	@GetMapping(value = "/logout/{username}")
	public LogoutResponse logout(@PathVariable String username) {
		return new LogoutResponse(service.logout(username), "USER_DISCONNECTED");
	}
}
