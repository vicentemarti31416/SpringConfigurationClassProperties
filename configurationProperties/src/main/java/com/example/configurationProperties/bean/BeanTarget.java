package com.example.configurationProperties.bean;

import org.springframework.stereotype.Component;

@Component
public class BeanTarget {

	private String username;
	private String password;
	
	public BeanTarget(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

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
}
