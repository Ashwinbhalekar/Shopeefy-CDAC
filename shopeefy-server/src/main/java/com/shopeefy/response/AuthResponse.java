package com.shopeefy.response;

public class AuthResponse {
	private String jwt;

	private String message;

	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}

	public AuthResponse(String jwt, String message) {
		super();
		this.jwt = jwt;
		this.message = message;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

//	
//	
//	private String jwt;
//	
//	private boolean status;
//	
//	public AuthResponse() {
//		// TODO Auto-generated constructor stub
//	}
//
//	public AuthResponse(String jwt, boolean status) {
//		super();
//		this.jwt = jwt;
//		this.status = status;
//	}
//
//	public String getJwt() {
//		return jwt;
//	}
//
//	public void setJwt(String jwt) {
//		this.jwt = jwt;
//	}
//
//	public boolean getStatus() {
//		return status;
//	}
//
//	public void setStatus(boolean status) {
//		this.status = status;
//	}
	
	

}
