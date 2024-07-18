package com.hibernate.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries(
		{ 
			@NamedQuery(
					name = "findEmployeeByName",
					query = "from Employee e where e.empName=:empName"
					
//					HQL-Hibernate Query Language
//					select * from Employee	-SQL
//					select * from Employee where name="Akanksha"	-SQL
//					from Employee			-HQL(written in Hibernate for select Query)
//					from Employee e where name = "Akanksha"			-HQL
//					order by max min
					
					)
//			,
//			@NamedQuery(
//					name = "findEmployees",
//					query = "from employee"
//					),
//			@NamedQuery(
//					name = "OrderByMaxSalary",
//					query = "from employee e order max(e.salary)"
//			)
		})

@Entity
@Table(name= "Employee2")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	int empId;
	String empName;
	int salary;
	String job;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int empId, String empName, int salary, String job) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.job = job;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", job=" + job + "]";
	}
	
	
		

}
