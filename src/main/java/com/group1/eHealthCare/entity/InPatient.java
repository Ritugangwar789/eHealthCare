package com.group1.eHealthCare.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name = "e_healthcare_inpatient1")
@NamedNativeQuery(name = "InPatient.findByNameNative", query = "select * from e_healthcare_inpatient1", resultClass = InPatient.class)
public class InPatient {	
	
	@Id
	@GeneratedValue
	private int ipid;
	private String ipaddress;
	private String ipdoa;
	private String ipdisease;
	private String ipgender;
	private String ipmail;
	private String ipname;
	private String ipphone;
	private int iproom;

	public InPatient() {
		super();
	}

	public InPatient(int ipid, String ipaddress, String ipdoa, String ipdisease, String ipgender, String ipmail,
			String ipname, String ipphone, int iproom) {
		super();
		this.ipid = ipid;
		this.ipaddress = ipaddress;
		this.ipdoa = ipdoa;
		this.ipdisease = ipdisease;
		this.ipgender = ipgender;
		this.ipmail = ipmail;
		this.ipname = ipname;
		this.ipphone = ipphone;
		this.iproom = iproom;
	}
	
	public int getIpid() {
		return ipid;
	}

	public void setIpid(int ipid) {
		this.ipid = ipid;
	}

	public String getIpaddress() {
		return ipaddress;
	}

	public void setIpaddress(String ipaddress) {
		this.ipaddress = ipaddress;
	}

	public String getIpdoa() {
		return ipdoa;
	}

	public void setIpdoa(String ipdoa) {
		this.ipdoa = ipdoa;
	}

	public String getIpdisease() {
		return ipdisease;
	}

	public void setIpdisease(String ipdisease) {
		this.ipdisease = ipdisease;
	}

	public String getIpgender() {
		return ipgender;
	}

	public void setIpgender(String ipgender) {
		this.ipgender = ipgender;
	}

	public String getIpmail() {
		return ipmail;
	}

	public void setIpmail(String ipmail) {
		this.ipmail = ipmail;
	}

	public String getIpname() {
		return ipname;
	}

	public void setIpname(String ipname) {
		this.ipname = ipname;
	}

	public String getIpphone() {
		return ipphone;
	}

	public void setIpphone(String ipphone) {
		this.ipphone = ipphone;
	}

	public int getIproom() {
		return iproom;
	}

	public void setIproom(int iproom) {
		this.iproom = iproom;
	}

}
