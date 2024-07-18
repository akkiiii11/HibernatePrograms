package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * SessionFactory:
 * A thread safe, immutable cache of compiled mappings for a single database.
 * It is heavy weight object, usually created during application initialization and kept for later use.
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Hibernate architecture
    	// SessionFactory
    	// Session
    	// Transaction
    	// Configuration  serviceRegistry
    	// Configure with hibernate xml file
    	
    	Configuration cfg = new Configuration();
    	cfg .configure("hibernate.cfg.xml");
    	
    	//session factory created
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	//open the session
    	Session session = sessionFactory.openSession();
    	
    	//begin transaction
    	Transaction tr = session.beginTransaction();
    	
    	//map object to database    	
//    	Employee emp1 = new Employee();
//    	emp1.setId(1);
//    	emp1.setName("Sunny");
//    	emp1.setDept("BBA");
//    	emp1.setSalary(20000);
    	
//    	Employee emp1 = new Employee();
//    	emp1.setId(2);
//    	emp1.setName("Akanksha");
//    	emp1.setDept("MCA");
//    	emp1.setSalary(10000);
    	
//    	Employee emp1 = new Employee();
//    	emp1.setId(3);
//    	emp1.setName("Nivedita");
//    	emp1.setDept("Clerk");
//    	emp1.setSalary(5000);
    	
    	Employee emp1 = new Employee();
    	emp1.setId(4);
    	emp1.setName("Ajay");
    	emp1.setDept("Manager");
    	emp1.setSalary(10000);
    	
    	session.save(emp1);
    	
    	tr.commit();
    	session.close();
    	System.out.println("Employee Added Successfully");
    
    }
}
