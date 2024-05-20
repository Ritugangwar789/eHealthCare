package com.group1.eHealthCare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "PDETAILS")
@NamedNativeQuery(name = "Personal.findByNameNative", query = "select * from PDETAILS", resultClass = Personal.class)
public class Personal {

	@Id
	@GeneratedValue
	private int id;
	private String username;
	private String email;
	private String dob;
	private String gender;
	private String address;
	private String fathername;
	private String mothername;

	public Personal() {
		super();
	}

	public Personal(int id, String username, String email, String dob, String gender, String address, String fathername,
			String mothername) {
		super();
		this.id = id;
		this.username = username;
		this.email = email;
		this.dob = dob;
		this.gender = gender;
		this.address = address;
		this.fathername = fathername;
		this.mothername = mothername;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getFathername() {
		return fathername;
	}

	public void setFathername(String fathername) {
		this.fathername = fathername;
	}

	public String getMothername() {
		return mothername;
	}

	public void setMothername(String mothername) {
		this.mothername = mothername;
	}

}
