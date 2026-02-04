package com.demo.beans;

import java.util.Date;

public class ContractEmp extends Employee{
	private float hours;
	private double rate;
	
	public ContractEmp() {
		super();
		System.out.println("in default constructor of ContractEmp class");
	}
	public ContractEmp(String pname, Date dob, String dept, String desg, float hours, double rate) {
		super("c",pname,dob,dept,desg);
		System.out.println("in parameterized constructor of ContractEmp class");
		this.hours = hours;
		this.rate = rate;
	}
	
	public float getHours() {
		return hours;
	}
	public void setHours(float hours) {
		this.hours = hours;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	@Override
	public double calulateSal() {
		return hours*rate;
	}
	@Override
	public String toString() {
		return "ContractEmp [hours=" + hours + ", rate=" + rate + "]";
	}
	
}
