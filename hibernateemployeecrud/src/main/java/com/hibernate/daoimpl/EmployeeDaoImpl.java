package com.hibernate.daoimpl;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.dao.EmployeeDao;
import com.hibernate.entity.Employee;
import com.hibernate.hibernateutil.HiberUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	@Override
	public void addEmp() {
		
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee First Name: ");
		String firstname = sc.next();
		System.out.println("Enter Employee Last Name: ");
		String lastname = sc.next();
		System.out.println("Enter Employee Number: ");
		String phone = sc.next();
		System.out.println("Enter Employee Address: ");
		String address = sc.next();
		System.out.println("Enter Employee Designation: ");
		String designation = sc.next();
		
		Employee emp = new Employee();
		emp.setEmpFirstName(firstname);
		emp.setSurname(lastname);
		emp.setPhone(phone);
		emp.setAddress(address);
		emp.setDesignation(designation);
		
		session.save(emp);
		
		tr.commit();
		session.close();
		
		System.out.println("Employee Added Successfully");
	}

	@Override
	public void updateEmp() {
		
		
			
	}

	@Override
	public void deleteEmp() {
		
		
	}

	@Override
	public void getEmp() {
		
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Employee Number to get: ");
		int id = sc.nextInt();
		
		Employee emp = session.load(Employee.class, id);
//		System.out.println("Empolyee Id: " +emp.getEmpId());
		System.out.println("Employee First Name: " +emp.getEmpFirstName());
		System.out.println("Employee Last Name: " +emp.getSurname());
		System.out.println("Employee Number: " +emp.getPhone());
		System.out.println("Employee Address: " +emp.getAddress());
		System.out.println("Employee Designation: " +emp.getDesignation());
		
		tr.commit();
		session.close();
		
	}
	
	

}
