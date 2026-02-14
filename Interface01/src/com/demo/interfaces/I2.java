package com.demo.interfaces;

public interface I2 {
	void m11();
	void m12(int y); 
	default void m13(){
		System.out.println("in method m12 of I2");
	}
}
