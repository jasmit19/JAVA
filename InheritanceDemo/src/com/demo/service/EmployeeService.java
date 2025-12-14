package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Contract;
import com.demo.beans.Employee;
import com.demo.beans.Salaried;

public class EmployeeService {
		/*
		static means these variables belong to the class, not to objects
		You do not need to create an object of EmployeeService (Eg. eservice) to access them.
		All your program methods (which are also static) can directly use them.
		*/
	static Employee[] emparr;
	static int count;
	
		//static bcoz Employee[] emparr is initialized static
	static {
		//initialize the emparr and give size
		emparr=new Employee[100];
		
		//Employee is an ABSTRACT class — you cannot create objects of it
		//emparr[0]=new Employee();
		
		//Create objects of child classes only, Since they extend Employee and implement calculateSal()
		emparr[0]=new Salaried("Rajan",new Date(2000,04,23),"HR","Designer",88888);
		emparr[1]=new Salaried("Revati",new Date(2000,04,23),"UX","Designer",99999);
		emparr[2]=new Contract("Ameya",new Date(2000,04,23),"HR","Designer",80,3000);
		emparr[3]=new Contract("Ashu",new Date(2000,04,23),"UX","Designer",80,4000);
		count=4;
	}

	public static boolean addNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		
			//check if emparr is full i.e reached capacity[100] or not
		if(count<emparr.length) {
			
			//no input for ID, bcoz it is auto generated
		System.out.println("enter employee name: ");
		String ename=sc.next();
		System.out.println("enter employee d.o.b. (dd/MM/yyyy): ");
		String bdate=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
			//Because you need to declare a Date variable before the try-catch
			//but the actual value will be assigned inside the try block
		Date dt=null;
			//String bd=sdf.format(bdate);
			//Date dt=sdf.format("dd/MM/yyyy");--------error, we don't have to use format
			//Parsing can fail → so you must use try-catch
		try {
			dt=sdf.parse(bdate);
		}catch(ParseException e) {
			e.printStackTrace();
		}
		System.out.println("enter employee department");
		String dept=sc.next();
		System.out.println("enter employee deignation");
		String desg=sc.next();
			//all default entries which common for all type of Employees (Salaried,Contact) are done
			//now customize
		if(ch==1) {
			System.out.println("enter employee salary: ");
			double sal=sc.nextDouble();
				//count tracks next available position of Employee[] array
			emparr[count]=new Salaried(ename,dt,dept,desg,sal);
			count++;
		}
		else if(ch==2) {
			System.out.println("enter no. of hours: ");
			float hours=sc.nextFloat();
			System.out.println("enter employee rate: ");
			double rate=sc.nextDouble();
			emparr[count]=new Contract(ename,dt,dept,desg,hours,rate);
			count++;
		}
		else {
			System.out.println("invalid choice, select 1 or 2");
		}
		return true;
		}
		return false;
	}

}
