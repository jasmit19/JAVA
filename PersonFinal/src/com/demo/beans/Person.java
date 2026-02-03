package com.demo.beans;

public class Person {
	private int pid;
	private String pname;
	static int count;
	static {
		count = 0;
	}
	private final int c;
	public Person() {
		super();
		count++;
		pid=count;
		c=13;
	}
	public Person(String pname) {
		super();
		count++;
		this.pid = count;
		this.pname = pname;
		c=25;
	}
	public int getPid() {
		return pid;
	}
//	public void setPid(int pid) {
//		this.pid = pid;
//	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public static int getCount() {
		return count;
	}
	public static void setCount(int count) {
		Person.count = count;
	}
	public int getC() {
		return c;
	}
	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", c=" + c + "]";
	}
}
