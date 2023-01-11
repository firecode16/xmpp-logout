package com.hunter.xmpp.logout.model;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Fredi Hernandez
 *
 */
@Component
@ConfigurationProperties
public class RestParams implements Serializable {

	private static final long serialVersionUID = 1L;

	@Value("${rest-api-provider-openfire}")
	private String host;
	@Value("${secret-key}")
	private String secretKey;
	@Value("${user-sessions}")
	private String userSessions;

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getSecretKey() {
		return secretKey;
	}

	public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}

	public String getUserSessions() {
		return userSessions;
	}

	public void setUserSessions(String userSessions) {
		this.userSessions = userSessions;
	}

}
