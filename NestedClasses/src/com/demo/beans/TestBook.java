package com.demo.beans;

public class TestBook {

	public static void main(String[] args) {
		Book b1 = new Book();
		
		Book.Lesson l1 = b1.new Lesson();
		l1.m1();
		
		Book b2 = new Book(101, "Harry Porter", 34, "Lesson1");
		
		System.out.println(b1);
		System.out.println(b2);
		b2.getL1();
		b2.getL1().m1();
	}

}
