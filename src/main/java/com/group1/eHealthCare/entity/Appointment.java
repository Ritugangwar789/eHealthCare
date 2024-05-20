package com.group1.eHealthCare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;

@Entity
@Table(name = "APPOINTMENTDETAILS")
@NamedNativeQuery(name = "Appointment.findByNameNative", query = "select * from APPOINTMENTDETAILS", resultClass = Appointment.class)
public class Appointment {

	@Id
	@Column(name = "AID")
	private int aid;
	
	@Column(name = "PID")
	private int pid;
	
	@Column(name = "PNAME")
	private String pname;
	
	@Column(name = "ADDRESS")
	private String address;
	
	@Column(name = "DOCNAME")
	private String docname;
	
	@Column(name = "APTDATE")
	private String date;
	
	@Column(name = "DISEASE")
	private String disease;
	
	@Column(name = "GENDER")
	private String gender;
	
	@Column(name = "MAIL")
	private String mail;
	
	@Column(name = "PPHONE")
	private String pphone;
	
	@Column(name = "ROOM")
	private String room;

	public Appointment() {
		super();

	}

	public Appointment(int aid, int pid, String pname, String address, String docname, String date, String disease,
			String gender, String mail, String pphone, String room) {
		super();
		this.aid = aid;
		this.pid = pid;
		this.pname = pname;
		this.address = address;
		this.docname = docname;
		this.date = date;
		this.disease = disease;
		this.gender = gender;
		this.mail = mail;
		this.pphone = pphone;
		this.room = room;
	}
	
	public int getaid() {
		return aid;
	}

	public void setaid(int aid) {
		this.pid = aid;
	}
	

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDocname() {
		return docname;
	}

	public void setDocname(String docname) {
		this.docname = docname;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getPphone() {
		return pphone;
	}

	public void setPphone(String pphone) {
		this.pphone = pphone;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

}
