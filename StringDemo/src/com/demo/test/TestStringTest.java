package com.demo.test;

public class TestStringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Test";
		String s2="Test";
		String s3=s2;
		String s4=new String("Test");
		
		System.out.println("s1 == s2 "+(s1 == s2));
		System.out.println("s1 == s3 "+(s1 == s3));
		System.out.println("s2 == s3 "+(s2 == s3));
		System.out.println("s2 == s4 "+(s2 == s4));
		System.out.println("s2.equals(s4) "+s2.equals(s4));
		s1="welcome";
		System.out.println(" s1 == s2 "+s1 == s2);
		
		
		//useful in Sing-threaded program, not thread safe
		StringBuilder sbd = new StringBuilder("test");
		StringBuilder str=sbd.append(" semi");
		System.out.println(str);					//test semi 
		System.out.println(sbd.append(" data"));	//test semi data
		System.out.println(str);					//test semi data
		
		//all the methods are synchronized, so they are thread safe
		//used in multi-threaded program
		StringBuffer sbf=new StringBuffer("hello");
		System.out.println(sbf.append(" Everyone"));	//hello Everyone
		
		
		String s6="xxx,yyy,zzz-rrr";
		String[] sarr=s6.split(",");
		int n=sarr.length;
		for(int i=0; i<n;i++) {
			System.out.println(sarr[i]);
		}
//		System.out.println(sarr);
		String s=String.join(":", sarr);
		System.out.println(s);
	}
}
