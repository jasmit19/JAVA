package com.demo.beans;

import java.util.Date;

public class Contract extends Employee {
	private float hours;
	private double rate;
	
	public Contract() {
		super();
		System.out.println("in  default constructor of Contract");
	}

	public Contract(String pname, Date bdate, String dept, String desg, float hours, double rate) {
		super("c", pname, bdate, dept, desg);
		System.out.println("in  parameterized constructor of Contract");
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
	public double calculateSal() {
		return hours*rate;
	}

	@Override
	public String toString() {
		return super.toString()+"Contract [hours=" + hours + ", rate=" + rate + "]";
	}
	
	
}
