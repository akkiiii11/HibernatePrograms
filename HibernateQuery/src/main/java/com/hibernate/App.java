package com.hibernate;

import java.util.Iterator;
import java.util.List;

import javax.persistence.TypedQuery;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hibernate.entity.Employee;
import com.hibernate.hibernateutil.HiberUtil;

public class App 
{
    public static void main( String[] args )
    {
    	Session session = HiberUtil.getSessionFactory().openSession();
    	Transaction tr = session.beginTransaction();
    	
//    	Employee emp = new Employee();
//    	emp.setEmpName("Akanksha");
//    	emp.setSalary(30000);
//    	emp.setJob("Sr.Manager");
//    	session.save(emp);
//    	
//    	Employee emp1 = new Employee();
//    	emp1.setEmpName("Sunny");
//    	emp1.setSalary(20000);
//    	emp1.setJob("Jr.Manager");
//    	session.save(emp1);
//    	
//    	Employee emp2 = new Employee();
//    	emp2.setEmpName("Nivedita");
//    	emp2.setSalary(50000);
//    	emp2.setJob("HR");
//    	session.save(emp2);
//    	
//    	Employee emp3 = new Employee();
//    	emp3.setEmpName("Shriyank");
//    	emp3.setSalary(15000);
//    	emp3.setJob("IT Trainer");
//    	session.save(emp3);
//    	
//    	tr.commit();
//    	session.close();
    	
    	System.out.println("Employee Added Successfully");
    	
    	TypedQuery query = session.getNamedQuery("findEmployeeByName");
    	query.setParameter("empName", "Akanksha");
    	
    	List<Employee> employees = query.getResultList();
    	Iterator<Employee> itr = employees.iterator();
    	
    	while(itr.hasNext())
    	{
    		Employee e = itr.next();
    		System.out.println(e);
    		System.out.println("Employee Name: " +e.getEmpName());
    	}
    	
    }

}
