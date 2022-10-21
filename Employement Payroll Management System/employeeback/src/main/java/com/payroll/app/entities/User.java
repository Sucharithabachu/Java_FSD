package com.payroll.app.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String employeeid;
	private String name;
	private String mobile;
	private String email;
	private String gender;
	private String dob;
	private String doj;
	private String password;
	private String designation;
	private String role = "2";
	private String schedule = "Not yet assigned";
    public User(long id, String employeeid, String name, String mobile, String email, String gender, String dob,
            String doj, String password, String designation, String role, String schedule) {
        super();
        this.id = id;
        this.employeeid = employeeid;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.gender = gender;
        this.dob = dob;
        this.doj = doj;
        this.password = password;
        this.designation = designation;
        this.role = role;
        this.schedule = schedule;
    }
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getEmployeeid() {
        return employeeid;
    }
    public void setEmployeeid(String employeeid) {
        this.employeeid = employeeid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getMobile() {
        return mobile;
    }
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getDob() {
        return dob;
    }
    public void setDob(String dob) {
        this.dob = dob;
    }
    public String getDoj() {
        return doj;
    }
    public void setDoj(String doj) {
        this.doj = doj;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public String getSchedule() {
        return schedule;
    }
    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }
    @Override
    public String toString() {
        return "User [id=" + id + ", employeeid=" + employeeid + ", name=" + name + ", mobile=" + mobile + ", email="
                + email + ", gender=" + gender + ", dob=" + dob + ", doj=" + doj + ", password=" + password
                + ", designation=" + designation + ", role=" + role + ", schedule=" + schedule + "]";
    }
	
	
	
}
