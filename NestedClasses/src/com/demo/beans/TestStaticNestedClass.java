package com.demo.beans;

public class TestStaticNestedClass {

	public static void main(String[] args) {
		MyParent.MyChild c1 = new MyParent.MyChild();
		c1.m1();
	}

}
