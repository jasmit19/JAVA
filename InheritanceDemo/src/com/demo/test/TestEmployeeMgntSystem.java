package com.demo.test;

import java.util.Scanner;

import com.demo.service.EmployeeService;

public class TestEmployeeMgntSystem {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		
		do {
			System.out.println("1. Add new Employee\n2. Display all");
			System.out.println("3. Display by ID\n4. Change salary or charges");
			System.out.println("5. Display salaried Employee\n6. Display Contract Employee");
			System.out.println("7. Search By Name\n8. Calculate net salary\n9. Exit\nChoice :");
			
			choice=sc.nextInt();
			switch(choice) {
			
			case 1:
				System.out.println("1. Salaried\n2. Contract\n3. choice:");
				int ch=sc.nextInt();
				boolean status=EmployeeService.addNewEmployee(ch);
				if(status) {
					System.out.println("Employee added successfully");
				}
				else {
					System.out.println("Error, not added");
				}
			}
		}while(choice!=1);
	}

}
