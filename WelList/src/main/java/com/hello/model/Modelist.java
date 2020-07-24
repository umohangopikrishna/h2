package com.hello.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Modelist {

	@Id
	private String name1;
	private String password1;
	public String getName() {
		return name1;
	}
	public void setName(String name1) {
		this.name1 = name1;
	}
	public String getPassword() {
		return password1;
	}
	public void setPassword(String password1) {
		this.password1 = password1;
	}
	
}
