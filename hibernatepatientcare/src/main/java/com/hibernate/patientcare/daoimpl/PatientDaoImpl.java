package com.hibernate.patientcare.daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.patientcare.dao.PatientDao;
import com.hibernate.patientcare.entity.Patient;
import com.hibernate.patientcare.hibernateutil.HiberUtil;

public class PatientDaoImpl implements PatientDao {

	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addPatient() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		
		String first_name,last_name, dob, address, phone_no, email_id, password;
		
		System.out.println("Enter the first name: ");
		first_name=sc.next();
		System.out.println("Enter the last name: ");
		last_name=sc.next();
		System.out.print("Enter the Birth Date: ");
		dob=sc.next();
		System.out.println("Enter the address: ");
		address=sc.next();
		System.out.println("Enter the Phone Number: ");
		phone_no=sc.next();
		System.out.println("Enter the Email Id: ");
		email_id=sc.next();
		System.out.println("Enter the Password: ");
		password=sc.next();
		
		Patient patient = new Patient();
		
		patient.setFirst_name(first_name);
		patient.setLast_name(last_name);
//		patient.setDob(dob);
		patient.setAddress(address);
		patient.setPhone_no(phone_no);
		patient.setEmail_id(email_id);
		
		session.save(patient);
		ts.commit();
		session.close();
		System.out.println("Patient data have been save Successfully!!");
		
	}

	@Override
	public void updatePatient() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the Patient ID to edit: ");
	    int patient_id = sc.nextInt();

	    Patient patientToUpdate = session.get(Patient.class, patient_id);
	    if (patientToUpdate != null) {
	        boolean isUpdating = true;
	        while (isUpdating) {
	            System.out.println("Select the field to Update:");
	            System.out.println("1. First Name");
	            System.out.println("2. Last Name");
	            System.out.println("3. Address");
	            System.out.println("4. Phone Number");
//	            System.out.println("5. Email Id");
	            System.out.println("6. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the new first name: ");
	                    String newFirstName = sc.nextLine();
	                    patientToUpdate.setFirst_name(newFirstName);
	                    break;
	                case 2:
	                    System.out.println("Enter the new last name: ");
	                    String newLastName = sc.nextLine();
	                    patientToUpdate.setLast_name(newLastName);
	                    break;
	                case 3:
	                    System.out.println("Enter the new Address: ");
	                    String newAddress = sc.nextLine();
	                    patientToUpdate.setAddress(newAddress);
	                    break;
	                case 4:
	                	System.out.println("Enter the new Phone number: ");
	                	String newPhoneNo = sc.next();
	                	patientToUpdate.setPhone_no(newPhoneNo);
                        break;
	                case 5:
	                    isUpdating = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }

	        session.update(patientToUpdate);
	        ts.commit();
	        System.out.println("Patient with ID " + patient_id + " has been updated.");
	    } else {
	        System.out.println("Patient with ID " + patient_id + " not found.");
	    }

	    session.close();
		
	}

	@Override
	public void deletePatient() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the Patient Id to delete: ");
	    int patient_id= sc.nextInt();

	    Patient patientToDelete = session.get(Patient.class, patient_id);
	    if (patientToDelete != null) {
	        session.delete(patientToDelete);
	        ts.commit();
	        System.out.println("Patient with ID " + patient_id + " has been deleted.");
	    } else {
	        System.out.println("Patient with ID " + patient_id + " not found.");
	    }

	    session.close();
		
	}

	@Override
	public void getPatient() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
	    List<Patient> patients = session.createQuery("FROM Patient", Patient.class).list();
	    session.close();

	    System.out.println("Patient List:");
	    for (Patient patient : patients) {
	    
	        System.out.println("First Name: " + patient.getFirst_name());
	        System.out.println("Last Name: " + patient.getLast_name());
	        System.out.println("Address: " + patient.getAddress());
	        System.out.println("Phone Number: " + patient.getPhone_no());
	        System.out.println("Email Id: " + patient.getEmail_id());
	        System.out.println();
	    }
		
	}

}
