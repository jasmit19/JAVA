package com.demo.test;

import com.demo.beans.Person;

public class TestPerson {
	public static void main(String args[]) {
		Person p1 = new Person();
		Person p2 = new Person();
		Person p3 = new Person("Nayan");
		Person p4 = new Person("Mayur");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}

}
