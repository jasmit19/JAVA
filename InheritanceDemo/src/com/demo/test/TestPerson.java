package com.demo.test;

import java.util.Date;

import com.demo.beans.Contract;
import com.demo.beans.Person;
import com.demo.beans.Salaried;

public class TestPerson {

	public static void main(String[] args) {
		
		//Date in entered like this by calling Date class constructor 
		//bcoz we have converted date to string in display, but here we are passing a date argument
		//But it will display the Date in String format
		Salaried s1=new Salaried("Rajan",new Date(2000,04,23),"HR","Designer",88888);
		Salaried s2=new Salaried("Revati",new Date(2000,04,23),"UX","Designer",99999);
		System.out.println("net salary of s1: "+s1.calculateSal());
		System.out.println("net salary of s2: "+s2.calculateSal());
		
		Contract c1=new Contract("Mugdha",new Date(2000,04,23),"HR","Designer",80,3000);
		Contract c2=new Contract("Tanaya",new Date(2000,04,23),"UX","Designer",80,4000);
		System.out.println("net salary of c1: "+c1.calculateSal());
		System.out.println("net salary of c2: "+c2.calculateSal());
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(c1);
		System.out.println(c2);
		/*
		❌ 1. Employee is an ABSTRACT class — you cannot create objects of it
		Because Employee is abstract, it cannot be directly instantiated.
		✔ Abstract classes CAN have constructors
		But ✔ they CANNOT be used with new to create objects
		Create objects of child classes only, Since they extend Employee and implement calculateSal()	
		*/
		
		/*
		Employee e1=new Employee("s","Rajan",new Date("19/03/2003"),"HR","Manager");
		Employee e2=new Employee("s","Sujata",new Date(),"Hr","Manager");
		System.out.println(e1);
		System.out.println(e2);
		*/
		
		Person p1=new Person("c","Nayan",new Date("12/02/2000"));
		System.out.println(p1);
		//no argument passed in new date() gives current date (today)
		Person p2=new Person("s","Kavita",new Date());
		System.out.println(p2);
		
	}

}
