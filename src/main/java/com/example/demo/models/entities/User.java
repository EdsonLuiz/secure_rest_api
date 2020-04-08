package com.example.demo.models.entities;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "users")
public class User {

	@Id
	UUID id;

	@Column(name = "username", unique = true)
	String username;
	String password;
	Boolean enabled = true;
	
	
	public User() {
	}
	
	
	public User(UUID id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}



	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
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

	public Boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
