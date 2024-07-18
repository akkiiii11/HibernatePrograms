package com.hibernate.patientcare.daoimpl;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.patientcare.dao.AdminDao;
import com.hibernate.patientcare.entity.Admin;
import com.hibernate.patientcare.hibernateutil.HiberUtil;

public class AdminDaoImpl implements AdminDao {
	
	Scanner sc = new Scanner(System.in);
	
	@Override
	public void addAdmin() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		
		String first_name,last_name,address,phone_no,email_id,password;
		
		System.out.println("Enter the first name: ");
		first_name=sc.next();
		System.out.println("Enter the last name: ");
		last_name=sc.next();
		System.out.println("Enter the address: ");
		address=sc.next();
		System.out.println("Enter the Phone Number: ");
		phone_no=sc.next();
		System.out.println("Enter the Email Id: ");
		email_id=sc.next();
		System.out.println("Enter the Password: ");
		password=sc.next();
		
		Admin admin = new Admin();
		
		admin.setFirst_name(first_name);
		admin.setLast_name(last_name);
		admin.setAddress(address);
		admin.setPhone_no(phone_no);
		admin.setEmail_id(email_id);
		
		session.save(admin);
		ts.commit();
		session.close();
		System.out.println("Admin data have been save Successfully!!");
		
	}

	@Override
	public void updateAdmin() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the Admin ID to edit: ");
	    int admin_id = sc.nextInt();

	    Admin adminToUpdate = session.get(Admin.class, admin_id);
	    if (adminToUpdate != null) {
	        boolean isUpdating = true;
	        while (isUpdating) {
	            System.out.println("Select the field to Update:");
	            System.out.println("1. First Name");
	            System.out.println("2. Last Name");
	            System.out.println("3. Address");
	            System.out.println("4. Phone Number");
	            System.out.println("5. Email Id");
	            System.out.println("5. Exit");

	            int choice = sc.nextInt();
	            sc.nextLine(); // Consume newline

	            switch (choice) {
	                case 1:
	                    System.out.println("Enter the new first name: ");
	                    String newFirstName = sc.nextLine();
	                    adminToUpdate.setFirst_name(newFirstName);
	                    break;
	                case 2:
	                    System.out.println("Enter the new last name: ");
	                    String newLastName = sc.nextLine();
	                    adminToUpdate.setLast_name(newLastName);
	                    break;
	                case 3:
	                    System.out.println("Enter the new Address: ");
	                    String newAddress = sc.nextLine();
	                    adminToUpdate.setAddress(newAddress);
	                    break;
	                case 4:
	                	System.out.println("Enter the new Phone number: ");
	                	String newPhoneNo = sc.next();
	                	adminToUpdate.setPhone_no(newPhoneNo);
                        break;
	                case 5:
	                    isUpdating = false;
	                    break;
	                default:
	                    System.out.println("Invalid choice. Please select a valid option.");
	                    break;
	            }
	        }

	        session.update(adminToUpdate);
	        ts.commit();
	        System.out.println("Admin with ID " + admin_id + " has been updated.");
	    } else {
	        System.out.println("Admin with ID " + admin_id + " not found.");
	    }

	    session.close();
		
	}

	@Override
	public void deleteAdmin() {
		// TODO Auto-generated method stub
		Session session = HiberUtil.getSessionFactory().openSession();
	    Transaction ts = session.beginTransaction();

	    System.out.println("Enter the Admin name to delete: ");
	    int admin_id= sc.nextInt();

	    Admin adminToDelete = session.get(Admin.class, admin_id);
	    if (adminToDelete != null) {
	        session.delete(adminToDelete);
	        ts.commit();
	        System.out.println("Admin with ID " + admin_id + " has been deleted.");
	    } else {
	        System.out.println("Admin with ID " + admin_id + " not found.");
	    }

	    session.close();

		
	}

	@Override
	public void getAdmin() {
		// TODO Auto-generated method stub
	    Session session = HiberUtil.getSessionFactory().openSession();
	    List<Admin> admins = session.createQuery("FROM Admin", Admin.class).list();
	    session.close();

	    System.out.println("Admin List:");
	    for (Admin admin : admins) {
	    
	        System.out.println("First Name: " + admin.getFirst_name());
	        System.out.println("Last Name: " + admin.getLast_name());
	        System.out.println("Address: " + admin.getAddress());
	        System.out.println("Phone Number: " + admin.getPhone_no());
	        System.out.println("Email Id: " + admin.getEmail_id());
	        System.out.println();
	    }

		
	}

}
