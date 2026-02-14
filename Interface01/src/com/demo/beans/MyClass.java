package com.demo.beans;

import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class MyClass implements I1,I2{

	@Override
	public void m11() {
		System.out.println("in method m11 of MyClass");
		
	}

	@Override
	public void m12(int y) {
		System.out.println("in method m12 of MyClass " + y);
	}

	@Override
	public void m1() {
		System.out.println("in method m1 of MyClass");
		
	}

	@Override
	public void m2(int x) {
		System.out.println("in method m2 of MyClass "+x);
		
	}

}
