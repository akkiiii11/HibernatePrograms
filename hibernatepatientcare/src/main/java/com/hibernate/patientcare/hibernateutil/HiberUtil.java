package com.hibernate.patientcare.hibernateutil;

/*collection 1.2
properties vector (legacy classes)

list        Queue        set
ArrayList   Deque        HashSet TreeSet LinkehashSet
LinkedList  priorityQue
Vector*/


import java.util.Properties;



import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.hibernate.service.ServiceRegistry;

import com.hibernate.patientcare.entity.Admin;
import com.hibernate.patientcare.entity.Appointment;
import com.hibernate.patientcare.entity.Doctor;
import com.hibernate.patientcare.entity.Medicine;
import com.hibernate.patientcare.entity.Patient;
import com.hibernate.patientcare.entity.Payment;
import com.hibernate.patientcare.entity.Prescription;

public class HiberUtil {

	private static SessionFactory sessionFactory; 
	
	public static SessionFactory getSessionFactory()
	{
		if(sessionFactory == null)
		{
			Properties settings=new Properties();
			settings.put(Environment.DRIVER,"com.mysql.jdbc.Driver");
			settings.put(Environment.DIALECT,"org.hibernate.dialect.MySQL5Dialect");
			settings.put(Environment.URL,"jdbc:mysql://localhost:3308/hibernatedb");
			settings.put(Environment.USER,"root");
			settings.put(Environment.PASS,"root");
			settings.put(Environment.HBM2DDL_AUTO,"update");
			settings.put(Environment.SHOW_SQL, "true");
			
			Configuration cfg=new Configuration();
			cfg.setProperties(settings);
			cfg.addAnnotatedClass(Admin.class);     //mapping class
			cfg.addAnnotatedClass(Patient.class);
			cfg.addAnnotatedClass(Doctor.class);
			cfg.addAnnotatedClass(Appointment.class);
			cfg.addAnnotatedClass(Medicine.class);
			cfg.addAnnotatedClass(Prescription.class);
			cfg.addAnnotatedClass(Payment.class);
			
			//interface							class
			ServiceRegistry serviceRegistry=new StandardServiceRegistryBuilder()
					.applySettings(cfg.getProperties()).build();
			
			/*ServiceRegistry serviceRegistry1;
			StandardServiceRegistryBuilder sc=new StandardServiceRegistryBuilder();
			sc.applySettings(cfg.getProperties());
			sc.build();*/
			sessionFactory=cfg.buildSessionFactory(serviceRegistry);
		}
		return sessionFactory;
		
	}
}



//package com.hibernate.patientcare.hibernateutil;
//
//import java.util.Properties;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.cfg.Configuration;
//import org.hibernate.cfg.Environment;
//import org.hibernate.service.ServiceRegistry;
//
//import com.hibernate.crud.entity.Employeeeee;
//
//
//
//public class HibernateConfig 
//{
//	private static SessionFactory sf;
//	public static SessionFactory getSessionFactory()
//	{
//	if(sf == null)
//	{
//		try
//		{
//			Configuration cfg = new Configuration();
//			Properties settings = new Properties();
//			settings.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
//			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
//			settings.put(Environment.USER, "root");
//			settings.put(Environment.PASS, "root");
//			settings.put(Environment.HBM2DDL_AUTO,"update");
//			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/empdb");
//			settings.put(Environment.SHOW_SQL,"true" );
//			settings.put(Environment.ENABLE_LAZY_LOAD_NO_TRANS, "true");
//
//			cfg.setProperties(settings);
//			cfg.addAnnotatedClass(Employeeeee.class);
//			ServiceRegistry serviceReg = new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
//			System.out.println("Created");
//		    sf = cfg.buildSessionFactory(serviceReg);
//		    //return sf;
//		    System.out.println("SessionFactory");
//		}
//		catch(Exception e)
//		{
//			System.out.println(e);
//		}
//	}
//	return sf;
//	 
//}
//public static Session getSession()
//{
//	return getSessionFactory().openSession();
//	
//}
//}
//
//
//
