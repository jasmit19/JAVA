package com.demo.interfaces;

@FunctionalInterface
public interface MyComparable {
	int compare(int x, int y);
	
	default int m1() {
		return 74;
	}
	
	static void m2() {
		System.out.println("int method m2 of MyComparable interface");
	}
}
