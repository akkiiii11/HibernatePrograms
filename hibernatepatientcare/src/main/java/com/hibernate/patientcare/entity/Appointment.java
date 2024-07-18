package com.hibernate.patientcare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Appointment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int appointment_id;
	private Date appointment_date;
	private String status;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Doctor doctor;

	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Appointment(int appointment_id, Date appointment_date, String status, Patient patient, Doctor doctor) {
		super();
		this.appointment_id = appointment_id;
		this.appointment_date = appointment_date;
		this.status = status;
		this.patient = patient;
		this.doctor = doctor;
	}


	public int getAppointment_id() {
		return appointment_id;
	}


	public void setAppointment_id(int appointment_id) {
		this.appointment_id = appointment_id;
	}


	public Date getAppointment_date() {
		return appointment_date;
	}


	public void setAppointment_date(Date appointment_date) {
		this.appointment_date = appointment_date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	public Doctor getDoctor() {
		return doctor;
	}


	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}


	@Override
	public String toString() {
		return "Appointment [appointment_id=" + appointment_id + ", appointment_date=" + appointment_date + ", status="
				+ status + ", patient=" + patient + ", doctor=" + doctor + "]";
	}
	
	

}
