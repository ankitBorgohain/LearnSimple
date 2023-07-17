package com.learnSimple.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	String firstname;
	String lastname;
	String email;
	String password;
	String role;
	
	String mobile;
	String dob;
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String firstname, String lastname, String email, String password, String role, String mobile, String dob) {
		super();
		this.id=id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email =email;
		this.password = password;
		this.role = role;
		this.mobile = mobile;
		this.dob = dob;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
}
