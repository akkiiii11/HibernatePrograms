package com.hibernate.patientcare.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Payment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int payment_id;
	private String amount;
	private Date payment_date;
	private String payment_method;
	
	@ManyToOne
	private Patient patient;

	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Payment(int payment_id, String amount, Date payment_date, String payment_method, Patient patient) {
		super();
		this.payment_id = payment_id;
		this.amount = amount;
		this.payment_date = payment_date;
		this.payment_method = payment_method;
		this.patient = patient;
	}


	public int getPayment_id() {
		return payment_id;
	}


	public void setPayment_id(int payment_id) {
		this.payment_id = payment_id;
	}


	public String getAmount() {
		return amount;
	}


	public void setAmount(String amount) {
		this.amount = amount;
	}


	public Date getPayment_date() {
		return payment_date;
	}


	public void setPayment_date(Date payment_date) {
		this.payment_date = payment_date;
	}


	public String getPayment_method() {
		return payment_method;
	}


	public void setPayment_method(String payment_method) {
		this.payment_method = payment_method;
	}


	public Patient getPatient() {
		return patient;
	}


	public void setPatient(Patient patient) {
		this.patient = patient;
	}


	@Override
	public String toString() {
		return "Payment [payment_id=" + payment_id + ", amount=" + amount + ", payment_date=" + payment_date
				+ ", payment_method=" + payment_method + ", patient=" + patient + "]";
	}
	
}
