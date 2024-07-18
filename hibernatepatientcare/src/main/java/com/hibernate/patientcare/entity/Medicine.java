package com.hibernate.patientcare.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Medicine {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int medicine_id;
	private String name;
	private String description;
	private String price;
	
	@OneToMany
	private Prescription prescription;

	
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Medicine(int medicine_id, String name, String description, String price, Prescription prescription) {
		super();
		this.medicine_id = medicine_id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.prescription = prescription;
	}


	public int getMedicine_id() {
		return medicine_id;
	}


	public void setMedicine_id(int medicine_id) {
		this.medicine_id = medicine_id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public Prescription getPrescription() {
		return prescription;
	}


	public void setPrescription(Prescription prescription) {
		this.prescription = prescription;
	}


	@Override
	public String toString() {
		return "Medicine [medicine_id=" + medicine_id + ", name=" + name + ", description=" + description + ", price="
				+ price + ", prescription=" + prescription + "]";
	}
	
	
	
}
