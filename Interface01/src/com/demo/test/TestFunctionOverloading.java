package com.demo.test;

import com.demo.beans.NewClass;

public class TestFunctionOverloading {

	public static void main(String[] args) {
		NewClass n1=new NewClass();
		//n1.add(73,1,2,3,4,5);
		System.out.println("sum="+n1.add(5,1,2,3));
		
		System.out.println(n1.max(2, 3));
		System.out.println(n1.max(2, 2));
		System.out.println(n1.max(3, 3));
		System.out.println(n1.max(5, 7, 3));
		System.out.println(n1.max(8.3f, 5.7f));
		System.out.println(n1.max("jasmit","lonhare"));

	}

}
