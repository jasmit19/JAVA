package com.demo.beans;

public class ClassA {
	private int x;
	public int y;
	public final void show() {
		System.out.println("in class A");
	}
	public void hello() {
		System.out.println("hello from class A");
	}
}

class ClassB extends ClassA{
//	public void show() {
//		
//	}
	
//	int z=x+y;
	int z=y+y;
	public void hello() {
		System.out.println("hi from class B");
	}	
	public int square(int a) {
		return a*y;	
	}
}
