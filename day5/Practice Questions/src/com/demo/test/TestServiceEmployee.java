package com.demo.test;

import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class TestServiceEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		EmployeeService eservice = new EmployeeServiceImpl();
		int choice = 0;
		do {
			System.out.println("""
					1. Add Employee to list
					2. Remove Employee from list
					3. Show all Employees
					4. Show all Employees in sorted order (sort on the basis of empID)
					5. Find an Employee with empName
					6. Save all Employees into file
					7. Quit
					""");

			choice = sc.nextInt();

			switch (choice) {
			case 1 -> { // Add Employee
				boolean status = eservice.addNewEmployee();
				if (status) {
					System.out.println("Employee added successfully!");
				} else {
					System.out.println("Unable to add the employee.");
				}
			}

			case 2 -> { // Remove Employee
				System.out.println("Enter Employee ID to remove:");
				int id = sc.nextInt();
				boolean removed = eservice.removeEmployee(id);
				if (removed) {
					System.out.println("Employee removed successfully!");
				} else {
					System.out.println("Employee not found!");
				}
			}

			case 3 -> { // Show all Employees
				List<Employee> elist = eservice.displayAll();
				if (elist.isEmpty()) {
					System.out.println("No employees to display.");
				} else {
					elist.forEach(System.out::println);
				}
			}

			case 4 -> { // Show all Employees in sorted order by empID
				List<Employee> sortedList = eservice.displaySortedById();
				if (sortedList.isEmpty()) {
					System.out.println("No employees to display.");
				} else {
					sortedList.forEach(System.out::println);
				}
			}

			case 5 -> { // Find Employee by name
				System.out.println("Enter employee name to search:");
				String name = sc.next();
				List<Employee> foundList = eservice.findByName(name);
				if (foundList != null && !foundList.isEmpty()) {
					foundList.forEach(System.out::println);
				} else {
					System.out.println("No employee found with that name.");
				}
			}

			case 6 -> { // Save all Employees into file
				boolean saved = eservice.saveAllToFile();
				if (saved) {
					System.out.println("All employees saved successfully to file!");
				} else {
					System.out.println("Error saving employees to file.");
				}
			}

			case 7 -> { // Quit
				sc.close();
				System.out.println("Thank you for visiting!");
				System.exit(0);
			}

			default -> {
				System.out.println("You have entered an incorrect choice. Please try again.");
			}
			}

		}while(choice !=7);
	}

}