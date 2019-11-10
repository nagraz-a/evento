package com.datafoundry.evento.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="user")
public class User {
	@Id
	private String id;
	private String first_name;
	private String last_name;
	private String email;
	private String phoneno;
	private String password;
	private Address address;
	private Date last_login;
	private List<String> intrests;
	private String token;
	private String status;
	private boolean is_active;
	
	public User() {
		
	}
	
	public User(String id, String first_name, String last_name, String email, String phoneno, String password,
			Address address, Date last_login, List<String> intrests, String token, String status, boolean is_active) {
		super();
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email = email;
		this.phoneno = phoneno;
		this.password = password;
		this.address = address;
		this.last_login = last_login;
		this.intrests = intrests;
		this.token = token;
		this.status = status;
		this.is_active = is_active;
	}
	
	public String getid() {
		return id;
	}
	public void setid(String id) {
		this.id = id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public List<String> getIntrests() {
		return intrests;
	}
	public void setIntrests(List<String> intrests) {
		this.intrests = intrests;
	}
	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isIs_active() {
		return is_active;
	}
	public void setIs_active(boolean is_active) {
		this.is_active = is_active;
	}

}
