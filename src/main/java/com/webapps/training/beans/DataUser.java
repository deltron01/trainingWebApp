package com.webapps.training.beans;

import java.io.Serializable;

public class DataUser implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7965489796632942493L;
	private String login;
	private String password;
	private Long id;
	
	
	


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
