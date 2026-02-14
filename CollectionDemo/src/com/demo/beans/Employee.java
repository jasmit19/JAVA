package com.demo.beans;

import java.time.LocalDate;

public class Employee {
	private int empid;
	private String ename;
	private double sal;
	private LocalDate doj;
	public Employee() {
		super();
	}
	public Employee(int empid) {
		super();
		this.empid = empid;
	}
	public Employee(int empid, String ename, double sal, LocalDate doj) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.sal = sal;
		this.doj = doj;
	}
	
	public boolean equals(Object obj) {
		System.out.println("in eayual method " +this.empid+" ," +((Employee)obj).empid);
		return this.empid == ((Employee)obj).empid;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public LocalDate getDoj() {
		return doj;
	}
	public void setDoj(LocalDate doj) {
		this.doj = doj;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", sal=" + sal + ", doj=" + doj + "]";
	}
	
	
}
