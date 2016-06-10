package com.retalia.models.methods;

public class LoginModel {
	private String Message;
	
	

	public LoginModel(String message) {
		this.Message = message;
	}

	public String getMessage() {
		return Message;
	}

	public void setMessage(String message) {
		this.Message = message;
	}
	

}
