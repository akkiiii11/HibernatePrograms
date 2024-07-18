package com.hibernate.Demo;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hibernate.Demo.entity.Child;
import com.hibernate.Demo.entity.Parent;

public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration();
    	cfg .configure("hibernate.cfg.xml");
    	
    	//session factory created
    	SessionFactory sessionFactory = cfg.buildSessionFactory();
    	
    	//open the session
    	Session session = sessionFactory.openSession();
    	
    	//begin transaction
    	Transaction tr = session.beginTransaction();
    	
    	Parent parent = new Parent();
    	parent.setpId(1);
    	parent.setpName("Amitabh");
    	
    	Child child1 = new Child();
    	child1.setcId(1);
    	child1.setcName("Abhishek");
    	child1.setParent(parent);
    	
    	Child child2 = new Child();
    	child2.setcId(2);
    	child2.setcName("Sunita");
    	child2.setParent(parent);
    	
    	session.save(child1);
    	session.save(child2);
    		
    	ArrayList list = new ArrayList();
    	list.add(child1);
    	list.add(child2);
    	parent.setChild(list);
    	
    	session.save(parent);
    	
    	tr.commit();
    	session.close();
    	
    	System.out.println("Parent and Child Added Successfully");
    	
    	
    }
}
