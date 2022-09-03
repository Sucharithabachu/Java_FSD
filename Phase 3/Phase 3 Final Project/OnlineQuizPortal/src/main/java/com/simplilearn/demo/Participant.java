package com.simplilearn.demo;


import javax.persistence.*;
@Entity
public class Participant {
	
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int Id;
	private String Name;
	private String Email;
	private String Phone;
	
	public Participant() { }
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}

	public Participant(String name, String email, String phone) {
		super();
		Name = name;
		Email = email;
		Phone = phone;
	}
	
	@Override
	public String toString() {
		return "Participant [Id=" + Id + ", Name=" + Name + ", Email=" + Email + ", Phone=" + Phone +"]";
	}

}