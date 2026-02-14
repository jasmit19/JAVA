package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;


public class TestEmployeeManagementSyst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		EmployeeService eservice=new EmployeeServiceImpl();
		int choice=0;
		do {
			System.out.println("1. add new employee \n2. display all \n3. search by id");
			System.out.println("4. Search by name \n5. update sal \n6. delete by id \n7. delete by salary");
			System.out.println("8. search by salary \n9. sort by salary \n10. Exit \nChoice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				boolean status=eservice.addNewEmployee();
				if(status)
					System.out.println("Employee added successfully");
				else
					System.out.println("Error");
				break;
			case 2:
				List<Employee> elist=eservice.displayAll();
				elist.forEach(System.out::println);
				break;
			case 3:
				System.out.println("enter Employee id to search");
				int id=sc.nextInt();
				Employee e=eservice.searchById(id);
				break;
			case 4:
				System.out.println("enter Employee name to search");
				String name=sc.next();
				elist=eservice.searchByName(name);
				break;
			case 5:
				System.out.println("enter ID of employee");
				id=sc.nextInt();
				System.out.println("Enter new Salaray");
				double sal=sc.nextDouble();
				status=eservice.updateByID(id,sal);
				if(status)
					System.out.println("ID updated successfully");
				else
					System.out.println("Error");
				break;
			case 6:
				System.out.println("enter ID of employee");
				id=sc.nextInt();
				status=eservice.deleteById(id);
				if(status)
					System.out.println("Employee added successfully");
				else
					System.out.println("Error");
				break;
			case 7:
				System.out.println("Enter salary of Employee to be deleted");
				sal=sc.nextDouble();
				status=eservice.deleteBySalary(sal);
				if(status) {
					System.out.println("deleted successfully");
				}else {
					System.out.println("not found");
				}
				break;
			case 8:
				System.out.println("Enter salary");
				sal=sc.nextDouble();
				elist=eservice.searchBySal(sal);
			case 9:
				System.out.println("enter salary for sorting");
				break;
			case 10:
				System.out.println("Thank You for visiting...");
				break;
			default:
				System.out.println("Wrong choice entered");
				break;
			}
		}while(choice!=10);

	}

}
