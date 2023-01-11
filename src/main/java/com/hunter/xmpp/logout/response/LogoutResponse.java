package com.hunter.xmpp.logout.response;

/**
 * @author Fredi Hernandez
 *
 */
public class LogoutResponse {

	private String result;
	private String message;
	private Object data;

	public LogoutResponse() {
	}

	public LogoutResponse(String result, Object data) {
		super();
		this.result = result;
		this.data = data;
	}

	public LogoutResponse(String result, String message) {
		super();
		this.result = result;
		this.message = message;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

}
