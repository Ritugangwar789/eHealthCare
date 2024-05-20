package com.group1.eHealthCare.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "EHC_OUTPATIENT")
public class OutPatient {
 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "OUT_P_ID")
	private int id;
	
	@Column(name = "P_NAME")
	private String patientName;
	
	@Column(name = "PH_NUMBER")
	private String phoneNumber;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "D_O_A")
	private String dateOfAppointment;
	
	@Column(name = "T_SLOT")
	private String timeSlot;
	
	@Column(name = "DEPT_NAME")
	private String department;
	
	@Column(name = "DIS_NAME")
	private String disease;
	
	@Column(name = "DOC_NAME")
	private String doctorName;

	public OutPatient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OutPatient(int id, String patientName, String phoneNumber, String email, String dateOfAppointment,
			String timeSlot, String department, String disease, String doctorName) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.dateOfAppointment = dateOfAppointment;
		this.timeSlot = timeSlot;
		this.department = department;
		this.disease = disease;
		this.doctorName = doctorName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDateOfAppointment() {
		return dateOfAppointment;
	}

	public void setDateOfAppointment(String dateOfAppointment) {
		this.dateOfAppointment = dateOfAppointment;
	}

	public String getTimeSlot() {
		return timeSlot;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getDisease() {
		return disease;
	}

	public void setDisease(String disease) {
		this.disease = disease;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	
	
}
