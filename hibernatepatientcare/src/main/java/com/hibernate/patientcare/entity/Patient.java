package com.hibernate.patientcare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int patient_id;
	private String first_name;
	private String last_name;
	private Date dob;
	private String address;
	private String phone_no;
	private String email_id;
	private String password;
	
	@OneToMany
	private Appointment appointment;
	
	@OneToMany
	private Prescription prescription;
	
	@OneToMany
	private Payment payment;

	
	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Patient(int patient_id, String first_name, String last_name, Date dob, String address, String phone_no,
			String email_id, String password, Appointment appointment, Prescription prescription, Payment payment) {
		super();
		this.patient_id = patient_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.dob = dob;
		this.address = address;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.password = password;
		this.appointment = appointment;
		this.prescription = prescription;
		this.payment = payment;
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


	public Date getDob() {
		return dob;
	}


	public void setDob(Date dob) {
		this.dob = dob;
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


	public Appointment getAppointment() {
		return appointment;
	}


	public void setAppointment(Appointment appointment) {
		this.appointment = appointment;
	}


	public Prescription getPrescription() {
		return prescription;
	}


	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}


	public Payment getPayment() {
		return payment;
	}


	public void setPayment(Payment payment) {
		this.payment = payment;
	}


	@Override
	public String toString() {
		return "Patient [patient_id=" + patient_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", dob=" + dob + ", address=" + address + ", phone_no=" + phone_no + ", email_id=" + email_id
				+ ", appointment=" + appointment + ", prescription=" + prescription + ", payment=" + payment + "]";
	}


}
