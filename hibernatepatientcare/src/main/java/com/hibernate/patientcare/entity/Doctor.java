package com.hibernate.patientcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Doctor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctor_id;
	private String first_name;
	private String last_name;
	private String specialization;
	private String schedule;
	private String phone_no;
	private String email_id;
	private String password;
	
	@OneToMany
	private Appointment appointment;
	
	@OneToMany
	private Prescription prescription;

	
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Doctor(int doctor_id, String first_name, String last_name, String specialization, String schedule,
			String phone_no, String email_id, String password, Appointment appointment, Prescription prescription) {
		super();
		this.doctor_id = doctor_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.specialization = specialization;
		this.schedule = schedule;
		this.phone_no = phone_no;
		this.email_id = email_id;
		this.password = password;
		this.appointment = appointment;
		this.prescription = prescription;
	}


	public int getDoctor_id() {
		return doctor_id;
	}


	public void setDoctor_id(int doctor_id) {
		this.doctor_id = doctor_id;
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


	public String getSpecialization() {
		return specialization;
	}


	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}


	public String getSchedule() {
		return schedule;
	}


	public void setSchedule(String schedule) {
		this.schedule = schedule;
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


	@Override
	public String toString() {
		return "Doctor [doctor_id=" + doctor_id + ", first_name=" + first_name + ", last_name=" + last_name
				+ ", specialization=" + specialization + ", schedule=" + schedule + ", phone_no=" + phone_no
				+ ", email_id=" + email_id + ", appointment=" + appointment + ", prescription=" + prescription + "]";
	}


	
	
	

}
