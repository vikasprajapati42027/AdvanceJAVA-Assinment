package com.phoenix.web.models;
/*
 * Author : vikas.prajapati@stltech.in
 * Creation Date : 26-jun-2021
 * version : 1.0
 * Copyright : Sterlite technologies Ltd.
 */
public class LoginBean {

	private String username;
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean isValid() {
		if(username!=null && password!=null && username.equals("satish")
				&& password.equals("1234"))
			return true;
		else
			return false;
	}
}
