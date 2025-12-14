package com.demo.test;

import java.util.Date;
import java.util.Scanner;

import com.demo.beans.Contract;
import com.demo.beans.Employee;
import com.demo.beans.Salaried;

public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Salaried\n2. Contract\n3. Exit");
		int choice=sc.nextInt();
		/*
		Because objects are created LATER inside the switch-case
		Before the switch → e1 and e2 have no object
		After user choice → they get assigned actual objects
		*/
		Employee e1=null;
		Employee e2=null;
		
		switch(choice) {
		case 1:
			e1=new Salaried("Rajan",new Date(2000,04,23),"HR","Designer",88888);
			e2=new Salaried("Arti",new Date(2000,04,23),"UX","Designer",99999);
			//System.out.println("net sal= "+e1.calculateSal());
	    	//System.out.println("net sal= "+e2.calculateSal());
			break;
		
		case 2:
			e1=new Contract("Mugdha",new Date(2000,04,23),"HR","Designer",80,3000);
			e2=new Contract("Tanaya",new Date(2000,04,23),"UX","Designer",80,4000);
			//System.out.println("net charges= "+e1.calculateSal());
	    	//System.out.println("net charges= "+e2.calculateSal());
			break;
			
		case 3:
			System.out.println("Thankyou for visiting...");
			break;
		}
		//repeated in both case 1 and 2
		//to minimize redundancy
		System.out.println("net charges= "+e1.calculateSal());
    	System.out.println("net charges= "+e2.calculateSal());
	}

}
