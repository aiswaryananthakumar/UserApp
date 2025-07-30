package com.skilljobbie.usersapp.model;

public class User {
	
	private long id;
	private String name;
	private String email;
	private String dept;
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getDept() {
		return dept;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}

}
