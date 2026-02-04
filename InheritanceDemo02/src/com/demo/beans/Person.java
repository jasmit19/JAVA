package com.demo.beans;

import java.util.Date;

public class Person {
	private String pid;
	private String pname;
	private Date dob;
	static int scount,ccount,vcount;
	static {
		scount=0;
		ccount=0;
		vcount=0;
	}
	
	public Person() {
		super();
		System.out.println("in default constructor of Person class");
		this.pid = generatedId("s");
		this.pname = null;
		this.dob = null;
	}

	public Person(String emptype, String pname, Date dob) {
		super();
		System.out.println("in parameterized constructor of Person class");
		this.pid = generatedId(emptype);
		this.pname = pname;
		this.dob = dob;
	}
	
	public String generatedId(String emptype) {
		if(emptype.equals("s")) {
			scount++;
			return emptype+scount;
		}
		else if(emptype.equals("c")) {
			ccount++;
			return emptype+ccount;
		}
		else if(emptype.equals("v")) {
			vcount++;
			return emptype+vcount;
		}
		else {
			return null;
		}
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public static int getScount() {
		return scount;
	}

	public static void setScount(int scount) {
		Person.scount = scount;
	}

	public static int getCcount() {
		return ccount;
	}

	public static void setCcount(int ccount) {
		Person.ccount = ccount;
	}

	public static int getVcount() {
		return vcount;
	}

	public static void setVcount(int vcount) {
		Person.vcount = vcount;
	}

	@Override
	public String toString() {
		return "Person [pid=" + pid + ", pname=" + pname + ", dob=" + dob + "]";
	}
}
