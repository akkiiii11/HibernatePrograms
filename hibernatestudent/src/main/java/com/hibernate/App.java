package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        
        SessionFactory sessionFactory = cfg.buildSessionFactory();
        
        Session session = sessionFactory.openSession();
        
        Transaction tr = session.beginTransaction();
        
//        Student stud = new Student();
//        stud.setId(1);
//        stud.setName("Akanksha");
//        stud.setAddress("Satara");
//        stud.setPhoneno(898989562);
//        stud.setMarks(90);
//        
//        session.save(stud);
//        tr.commit();
//        session.close();
//        System.out.println("Student Add Successfully");
        
        Department dept = new Department();
        dept.setDepId(1);
        dept.setDeptName("MCA Dept");
        dept.setDeptLocation("Pune");
        dept.setDeptHODName("MSD");
        
        session.save(dept);
        tr.commit();
        session.close();
        System.out.println("Department Add Successfully");
        
    }
}
