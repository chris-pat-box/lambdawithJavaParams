package com.oceanlife.java.lambda;

import java.util.Map;

public class GatewayResponse {
	
	private String body;
	private Integer StatusCode;
	private Map<String, String> headers;
	private boolean isBase64Encoded;
	
	public GatewayResponse(String body, Integer statusCode, Map<String, String> headers, boolean isBase64Encoded) {
		this.body = body;
		StatusCode = statusCode;
		this.headers = headers;
		this.isBase64Encoded = isBase64Encoded;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public Integer getStatusCode() {
		return StatusCode;
	}
	public void setStatusCode(Integer statusCode) {
		StatusCode = statusCode;
	}
	public Map<String, String> getHeaders() {
		return headers;
	}
	public void setHeaders(Map<String, String> headers) {
		this.headers = headers;
	}
	public boolean isBase64Encoded() {
		return isBase64Encoded;
	}
	public void setBase64Encoded(boolean isBase64Encoded) {
		this.isBase64Encoded = isBase64Encoded;
	}
	
	

}
