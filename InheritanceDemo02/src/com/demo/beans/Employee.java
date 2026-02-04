package com.demo.beans;

import java.util.Date;

abstract public class Employee extends Person{
	private String dept;
	private String desg;
	
	public Employee() {
		super();
		System.out.println("in default constructor of Employee class");
	}

	public Employee(String emptype, String pname, Date dob, String dept, String desg) {
		super(emptype,pname,dob);
		System.out.println("in default parameterized constructor of Person class");
		this.dept = dept;
		this.desg = desg;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getDesg() {
		return desg;
	}

	public void setDesg(String desg) {
		this.desg = desg;
	}
	
	abstract public double calulateSal();

	@Override
	public String toString() {
		return "Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
}
