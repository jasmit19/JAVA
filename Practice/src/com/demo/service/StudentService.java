package com.demo.service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Student;

public class StudentService {
	Scanner sc=new Scanner(System.in);
	static Student[] studarr;
	public static int cnt=0;
	static {
		studarr=new Student[100];
	}
	
	public void display(Student s1) {
		System.out.println("id: "+s1.getId());
		System.out.println("name: "+s1.getName());
		System.out.println("m1: "+s1.getM1());
		System.out.println("m2: "+s1.getM2());
		System.out.println("date: "+s1.getBdate());
		
	}

	public static boolean addNewStudent() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter student id: ");
		int sid=sc.nextInt();
		
		//sc.nextLine();
		System.out.println("enter student name: ");
		String sname=sc.next();
		
		System.out.println("enter marks 1: ");
		Double m1=sc.nextDouble();
		
		System.out.println("enter marks m2: ");
		Float m2=sc.nextFloat();
		
		System.out.println("enter dob date(dd/MM/yyyy)");
		String dt=sc.next();
		
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
		//SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		LocalDate ldt=LocalDate.parse(dt);
		//Date bdt=null;
		
//		try {
//			bdt=sdf.parse(dt);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		//Student s=new Student(sid, sname, m1, m2, dt);
		Student s=new Student(sid, sname, m1, m2,ldt);
		
		if(cnt==studarr.length) {
			System.out.println("array is full");
			return false;
		}else {
			studarr[cnt]=s;
			cnt++;
			return true;
		}
	}

	public static void displayAll() {
		for(int i=0;i<cnt;i++) {
			System.out.println(studarr[i]);
		}	
	}

	public static Student findById(int id) {
			for(Student s:studarr) {
				if(s.getId()==id) {
					System.out.println("student found");
					return s;
				}
				else {
					System.out.println("id not found");
				}
			}
		return null;
	}
	
}
