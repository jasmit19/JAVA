package com.demo.test;

import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;

public class TestEmpMgmtSyst {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EmployeeService eservice = new EmployeeService();
		int choice=0;
		System.out.println("1. add new Employee\n 2. Display all");
		System.out.println("3. Display by id\n 4. change sal or charges");
		System.out.println("5. Display Salaried Employee\n 6. Display Contract Employee");
		System.out.println("7. Search By Name\n 8. calculate net salary\n9. exit\n Choice :");
		choice = sc.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("1. Salaried Employee \n2.Contract Employee \n3.Contract Employee");
			int ch=sc.nextInt();
			Boolean status=eservice.addNewEmployee(ch);
			if(status)
				System.out.println("Employee added successfully");
			else
				System.out.println("ERROR");
			break;
		case 2:
			eservice.displayAllEmp();
			break;
		case 3:
			System.out.println("Enter id to search");
			String id=sc.next();
			Employee emp=eservice.findEmpById(id);
			if(emp!=null)
				System.out.println(emp);
			else
				System.out.println("Not Found");
			break;
		case 4:
			System.out.println("Enter id to search");
			id=sc.next();
			System.out.println("Enter new salary");
			double sal=sc.nextDouble();
			System.out.println("Enter new rate");
			double rate=sc.nextDouble();
			status=eservice.modifyById(id,sal,rate);
			if(status)
				System.out.println("Modified successfully");
			else
				System.out.println("ERROR");
			break;
		case 5:
			emp=eservice.displaySalariedEmp();
			break;
		case 6:
			emp=eservice.displayContractEmp();
			break;
		case 7:
			System.out.println("Enter name");
			String name=sc.next();
			emp=eservice.searchByName(name);
			if(emp!=null) 
				System.out.println(emp);
			else
				System.out.println("Not found");
			break;
		case 8:
			double netsal=eservice.calculateNetSal();
			System.out.println(netsal);
			break;
		case 9:
			System.out.println("ThankYou for visiting!");
			break;
		default:
			System.out.println("Wrong choice");
		}while(choice!=10);
	}

}
