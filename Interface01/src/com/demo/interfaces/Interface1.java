package com.demo.interfaces;

public interface Interface1 {
	int m21();
	
	int i=43;
	void m22(int i);
	
	private void m23() {
		System.out.println("in method 23 of Interface1");
	}
	default void m24() {
		m23();
		System.out.println("in method 24 of Interface1");
	}
	default int m25() {
		m23();
		System.out.println("in method 25 of Interface 1");
		return 10;
	}
	static void myFunction() {
		System.out.println("in method myFunction of Interface 1");
	}
}
