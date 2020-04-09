package com.example.demo.models.entities;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name = "authorities")
public class UserAuthority {

	@Id
	UUID id;

	@ManyToOne
	@JoinColumn(name = "username", referencedColumnName = "username")
	User user;

	String authority;

	public UserAuthority() {
	}

	public UserAuthority( User user, String authority) {
		this.id = UUID.randomUUID();
		this.user = user;
		this.authority = authority;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

}
