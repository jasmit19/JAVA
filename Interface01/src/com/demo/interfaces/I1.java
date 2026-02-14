package com.demo.interfaces;

public interface I1 {
//	int i;
	int i=65;
	void m1();
	void m2(int x);
	default void m3() {
		System.out.println("in method m3 of I1");
	}
}
