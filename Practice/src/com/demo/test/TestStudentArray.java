package com.demo.test;

import java.util.Scanner;

import com.demo.service.StudentService;

public class TestStudentArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int choice=0;
		//StudentService sservice=new StudentService();
		do {
			System.out.println("1. add new student\n2. display all\n3. search by id\n");
			System.out.println("4. search by name\n5. update marks\n6. exit\n");
			System.out.println("choice:");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				boolean status=StudentService.addNewStudent();
				if(status) {
					System.out.println("new student added");
				}else {
					System.out.println("ERROR: not added");
				}
				
			case 2:
				StudentService.displayAll();
				break;
				
			case 3:
				System.out.println("enter id");
				int id=sc.nextInt();
				if(StudentService.cnt>0) {
					StudentService.findById(id);
				}
			}
		}while(choice!=6);
	}

}
