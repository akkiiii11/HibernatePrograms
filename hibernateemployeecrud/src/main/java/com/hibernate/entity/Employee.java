package com.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class Employee {
	//create table employee
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int empId;
	
	@Column(name = "FirstName", length = 30)
	private String empFirstName;
	
	@Column(name = "LastName", length = 30)
	private String surname;
	
	@Column(name = "PhoneNo", length = 10)
	private String phone;
	
	@Column(length = 100)
	private String address;
	
	@Column(length = 50)
	private String designation;

	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Employee(int empId, String empFirstName, String surname, String phone, String address, String designation) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.surname = surname;
		this.phone = phone;
		this.address = address;
		this.designation = designation;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", surname=" + surname + ", phone="
				+ phone + ", address=" + address + ", designation=" + designation + "]";
	}
}
