package com.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO - Plain old java object
// Bean - spring 
// Entity
// cfg - it is configuration
// JPA (API) super interface jakrta(its specification only its advance version)
// Hibernate implementation
// Hibernate, EclipseLink and Apache OpenJPA


@Entity
@Table(name="Emp_Details")
public class Employee {		//create table Employee(id int, name varchar(255), dept varchar(255), salary varchar(255)) 
	
	@Id
	private int id;	
	
	@Column(name="empname")
	private String name;
	
	@Column(name="empdept")
	private String dept;
	
	@Column(name="empsal")
	private int salary;
	
	public Employee() {
		super();
		
	}
	
		
	public Employee(int id, String name, String dept, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + "]";
	}
	
	

}
