package com.simplilearn.demo;

public class User {
	private int Id;
	private String Name;
	private String Password;
	private String Role;
	
	public User() { }

	public User(String name, String password, String role) {
		
		Name = name;
		Password = password;
		Role = role;
	}

	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}

	public String getRole() {
		return Role;
	}

	public void setRole(String role) {
		Role = role;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

}