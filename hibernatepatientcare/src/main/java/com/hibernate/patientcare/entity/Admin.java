package com.hibernate.patientcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_id;
	private String first_name;
	private String last_name;
	private String address;
	private String phone_no;
	private String email_id;
	private String password;
	
	
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Admin(int patient_id, String first_name, String last_name, String address, String phone_no, String email_id,
			String password) {
		super();
		this.patient_id = patient_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.address = address;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.password = password;
	}


	public int getPatient_id() {
		return patient_id;
	}


	public void setPatient_id(int patient_id) {
		this.patient_id = patient_id;
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


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getPhone_no() {
		return phone_no;
	}


	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}


	public String getEmail_id() {
		return email_id;
	}


	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	
}
