package com.moviecruiser.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private int us_id;
	@Column
	private String us_name;
	@Column
	private String us_password;
	@Column
	private String us_category;
	
	
	
	public User() {
		super();
	}

	public User(int us_id, String us_name, String us_password, String us_category) {
		super();
		this.us_id = us_id;
		this.us_name = us_name;
		this.us_password = us_password;
		this.us_category = us_category;
	}

	public int getUs_id() {
		return us_id;
	}

	public void setUs_id(int us_id) {
		this.us_id = us_id;
	}

	public String getUs_name() {
		return us_name;
	}

	public void setUs_name(String us_name) {
		this.us_name = us_name;
	}

	public String getUs_password() {
		return us_password;
	}

	public void setUs_password(String us_password) {
		this.us_password = us_password;
	}

	public String getUs_category() {
		return us_category;
	}

	public void setUs_category(String us_category) {
		this.us_category = us_category;
	}
	
	

}
