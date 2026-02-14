package com.demo.test;

import com.demo.beans.MyClass;
import com.demo.interfaces.I1;
import com.demo.interfaces.I2;

public class TesMyClass {

	public static void main(String[] args) {
//		MyClass c1=new MyClass();
//		c1.m1();
//		c1.m11();
//		c1.m12(55);
//		c1.m13();
//		c1.m2(66);
//		c1.m3();
		
		MyClass ob=new MyClass();
		ob.m2(10);
		
		I1 ob2=new MyClass();
		ob2.m1();
		((MyClass) ob2).m3();
		
		I2 ob3=new MyClass();
		((MyClass) ob3).m11();
	}

}
