package com.hibernate;

import java.util.Scanner;

import com.hibernate.daoimpl.EmployeeDaoImpl;

public class App 
{
    public static void main( String[] args )
    {
    	char a;
    	EmployeeDaoImpl daoimpl=new EmployeeDaoImpl();
    	do
    	{
    		Scanner sc=new Scanner(System.in);
    		System.out.println("Employee Registration");
    		System.out.println("1. Add the Employee: 2. Display Employee : 3. Delete employee 4. Update Employee");
    		System.out.println("Enter the choice");
    		int ch=sc.nextInt();
    		switch(ch)
    		{
    		case 1:
    		{
    			daoimpl.addEmp();
    			break;
    		}
    		case 2:
    		{
    			daoimpl.getEmp();
    			break;
    		}
    		case 3:
    		{
    			daoimpl.deleteEmp();
    			break;
    		}
    		case 4:
    		{
    			daoimpl.updateEmp();
    			break;
    		}
    		case 5:
    		
    			System.exit(0);
    			break;
    		}
    		System.out.println("Do you want to continue Y/N");
    		a=sc.next().charAt(0);
    		
    	}
    	while(a=='Y' || a=='y');
    	System.out.println("Thanks");
    	
    
    }
}