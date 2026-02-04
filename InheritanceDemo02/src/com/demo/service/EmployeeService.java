package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.ContractEmp;
import com.demo.beans.Employee;
import com.demo.beans.SalariedEmp;

public class EmployeeService {
	static Employee[] earr;
	static int count;	
	static {
		earr=new Employee[100];
		earr[0]=new SalariedEmp("Rajan",new Date(2000,04,23),"HR","Designer",88888);
		earr[1]=new SalariedEmp("Revti",new Date(2012,10,14),"IT","Designer",99999);
		earr[2]=new ContractEmp("Mayur",new Date(2000,04,23),"UI","Designer",400,1500);
		earr[3]=new ContractEmp("Dipak",new Date(1995,11,07),"UI","Designer",200,3500);
		count=4;
	}

	public Boolean addNewEmployee(int ch) {
		Scanner sc=new Scanner(System.in);
		if(count!=earr.length) {
		System.out.println("Enter Name of Employee");
		String name=sc.next();
		System.out.println("Enter DOJ");
		String date=sc.next();
		SimpleDateFormat sdf=new SimpleDateFormat();
		Date doj=null;
		try {
			doj=sdf.parse(date);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Enter department");
		String dept=sc.next();
		System.out.println("Enter designation");
		String desg=sc.next();
		if(ch==2) {
			System.out.println("Enter hours");
			float hr=sc.nextFloat();
			System.out.println("Enter rate");
			double rate=sc.nextDouble();
			earr[count]=new ContractEmp(name,doj,dept,desg,hr,rate);
		}
		else {
			System.out.println("Enter salary");
			double sal=sc.nextDouble();
			earr[count]=new SalariedEmp(name,doj,dept,desg,sal);
		}
		return true;
	}
	return false;
	}

	public static void displayAllEmp() {
		for(Employee emp:earr)
		{
			if(emp!=null) {
				System.out.println(emp);
			}
		}
		
	}

	public Employee findEmpById(String id) {
		for(Employee emp:earr) {
			if(emp!=null) {
				if(emp.getPid().equals(id)) {
					return emp;
				}
			}
		}
		return null;
	}

	public Boolean modifyById(String id, double sal, double rate) {
		Employee e=findEmpById(id);
		if(e!=null) {
			if(e instanceof ContractEmp) {
				((ContractEmp) e).setRate(rate);
				return true;
			}
			else if(e instanceof SalariedEmp) {
				((SalariedEmp) e).setSal(sal);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}

	public Employee displaySalariedEmp() {
		for(Employee e:earr) {
			if(e!=null && e instanceof SalariedEmp) {
				System.out.println(e);
			}
		}
		return null;
	}

	public Employee displayContractEmp() {
		for(Employee e:earr) {
			if(e!=null && e instanceof ContractEmp) {
				System.out.println(e);
			}
		}
		return null;
	}

	public Employee searchByName(String name) {
		String nm=name.toLowerCase();
		for(Employee e:earr) {
			if(e.getPname().toLowerCase().equals(nm)) {
				return e;
			}
		}
		return null;
	}

	public double calculateNetSal() {
		double sal=0;
		for(Employee e:earr) {
			if(e!=null && e instanceof SalariedEmp) {
				sal=sal+e.calulateSal();
				return sal;
			}
		}
		return 0;
	}
	
	
	
}
