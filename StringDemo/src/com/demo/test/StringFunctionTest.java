package com.demo.test;

import java.util.stream.Stream;

public class StringFunctionTest {

	public static void main(String[] args) {
		String str="rain in SPAIN in plain";
		System.out.println("matches: "+str.matches(".*a.*n.*"));
		String s1="Happy life";
		System.out.println("matches: "+s1.matches(".*fe"));		
		
		boolean r=str.isBlank();
		System.out.println(r);
		
		str="";
		System.out.println(str.isBlank());
		str="testing \nis a \rtechnical \nportal";
		System.out.println(str);
		
		Stream<String> lines = str.lines();
//		System.out.println(lines);
		
		lines.forEach(System.out::println);
		
		str="	hello	";
		System.out.println("using strip: "+str.strip());
		System.out.println("using stripLeading: "+str.stripLeading());
		System.out.println("using stripTrailing: "+str.stripTrailing());
	}
	
}
