package com.hibernate.patientcare;

import java.util.Scanner;

import com.hibernate.patientcare.daoimpl.AdminDaoImpl;
import com.hibernate.patientcare.daoimpl.PatientDaoImpl;


public class App 
{
    public static void main( String[] args )
    {
    	Scanner scanner=new Scanner(System.in);
		System.out.println("Welcome to Patient Care System");
		System.out.println("1. Admin: 2. Patient : 3. Doctor 4. Appointment 5. Medicine 6. Prescription 7. Payment");
		System.out.println("Enter the choice");
		int c=scanner.nextInt();
		switch(c)
		{
		case 1:
		{
			char a;
	    	AdminDaoImpl daoimpl=new AdminDaoImpl();
	    	do
	    	{
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Admin Details");
	    		System.out.println("1. Add the Admin: 2. Display Admin : 3. Delete Admin 4. Update Admin");
	    		System.out.println("Enter the choice");
	    		int ch=sc.nextInt();
	    		switch(ch)
	    		{
	    		case 1:
	    		{
	    			daoimpl.addAdmin();
	    			break;
	    		}
	    		case 2:
	    		{
	    			daoimpl.getAdmin();
	    			break;
	    		}
	    		case 3:
	    		{
	    			daoimpl.deleteAdmin();
	    			break;
	    		}
	    		case 4:
	    		{
	    			daoimpl.updateAdmin();
	    			break;
	    		}
	    		case 5:
	    		{
	    			System.exit(0);
	    			break;
	    		}
	    		}
	    		System.out.println("Do you want to continue Y/N");
	    		a=sc.next().charAt(0);
	    		
	    	}
	    	while(a=='Y' || a=='y');
	    	System.out.println("Thanks");
	    	break;
		}
		
		case 2:
		{
			char a;
	    	PatientDaoImpl daoimpl=new PatientDaoImpl();
	    	do
	    	{
	    		Scanner sc=new Scanner(System.in);
	    		System.out.println("Patient Details");
	    		System.out.println("1. Add the Patient: 2. Display Patient : 3. Delete Patient 4. Update Patient");
	    		System.out.println("Enter the choice");
	    		int ch=sc.nextInt();
	    		switch(ch)
	    		{
	    		case 1:
	    		{
	    			daoimpl.addPatient();
	    			break;
	    		}
	    		case 2:
	    		{
	    			daoimpl.getPatient();
	    			break;
	    		}
	    		case 3:
	    		{
	    			daoimpl.deletePatient();
	    			break;
	    		}
	    		case 4:
	    		{
	    			daoimpl.updatePatient();
	    			break;
	    		}
	    		case 5:
	    		{
	    			System.exit(0);
	    			break;
	    		}
	    		}
	    		System.out.println("Do you want to continue Y/N");
	    		a=sc.next().charAt(0);
	    		
	    	}
	    	while(a=='Y' || a=='y');
	    	System.out.println("Thanks");
	    	break;
		}
		}
		

    }
}




//package com.hibernate.patientcare;
//
//import java.util.Scanner;
//
//import com.hibernate.patientcare.daoimpl.AdminDaoImpl;
//
//
//public class App 
//{
//    public static void main( String[] args )
//    {
//    	char a;
//    	AdminDaoImpl daoimpl=new AdminDaoImpl();
//    	do
//    	{
//    		Scanner sc=new Scanner(System.in);
//    		System.out.println("Admin Details");
//    		System.out.println("1. Add the Admin: 2. Display Admin : 3. Delete Admin 4. Update Admin");
//    		System.out.println("Enter the choice");
//    		int ch=sc.nextInt();
//    		switch(ch)
//    		{
//    		case 1:
//    		{
//    			daoimpl.addAdmin();
//    			break;
//    		}
//    		case 2:
//    		{
//    			daoimpl.getAdmin();
//    			break;
//    		}
//    		case 3:
//    		{
//    			daoimpl.deleteAdmin();
//    			break;
//    		}
//    		case 4:
//    		{
//    			daoimpl.updateAdmin();
//    			break;
//    		}
//    		case 5:
//    		
//    			System.exit(0);
//    			break;
//    		}
//    		System.out.println("Do you want to continue Y/N");
//    		a=sc.next().charAt(0);
//    		
//    	}
//    	while(a=='Y' || a=='y');
//    	System.out.println("Thanks");
//
//    }
//}
