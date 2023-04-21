package com.railway.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login_credentials")
public class Login {
	
	@Id
	private int login_id;
	private String password;

	public Login(int login_id, String password) {
		super();
		this.login_id = login_id;
		this.password = password;
	}

	public Login() {
	}

	public int getLogin_id() {
		return login_id;
	}

	public void setLogin_id(int login_id) {
		this.login_id = login_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
