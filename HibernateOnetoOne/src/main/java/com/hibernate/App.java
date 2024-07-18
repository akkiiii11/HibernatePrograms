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
        
        Husband hs = new Husband();
        Wife wi = new Wife();
        
//        hs.setHid(1);
//        hs.sethNAme("Amitabh");
//        hs.setWife(wi);
//        
//        wi.setwId(1);
//        wi.setwName("Jaya");
//        wi.setHusband(hs);
        
        hs.setHid(2);
        hs.sethNAme("Abhishek");
        hs.setWife(wi);
        
        wi.setwId(2);
        wi.setwName("Aishwarya");
        wi.setHusband(hs);
        
        session.save(wi);
        session.save(hs);
        
        tr.commit();
        session.close();
        
        System.out.println("Husband Wife Add Successfully");
    }
}
