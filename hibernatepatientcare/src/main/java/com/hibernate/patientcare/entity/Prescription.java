package com.hibernate.patientcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Prescription {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int prescription_id;
	private String dose;
	private String duration;
	
	@ManyToOne
	private Patient patient;
	
	@ManyToOne
	private Doctor doctor;
	
	@ManyToOne
	private Medicine medicine;

	
	public Prescription() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Prescription(int prescription_id, String dose, String duration, Patient patient, Doctor doctor,
			Medicine medicine) {
		super();
		this.prescription_id = prescription_id;
		this.dose = dose;
		this.duration = duration;
		this.patient = patient;
		this.doctor = doctor;
		this.medicine = medicine;
	}


	public int getPrescription_id() {
		return prescription_id;
	}


	public void setPrescription_id(int prescription_id) {
		this.prescription_id = prescription_id;
	}


	public String getDose() {
		return dose;
	}


	public void setDose(String dose) {
		this.dose = dose;
	}


	public String getDuration() {
		return duration;
	}


	public void setDuration(String duration) {
		this.duration = duration;
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


	public Medicine getMedicine() {
		return medicine;
	}


	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}


	@Override
	public String toString() {
		return "Prescription [prescription_id=" + prescription_id + ", dose=" + dose + ", duration=" + duration
				+ ", patient=" + patient + ", doctor=" + doctor + ", medicine=" + medicine + "]";
	}
	
	

}
