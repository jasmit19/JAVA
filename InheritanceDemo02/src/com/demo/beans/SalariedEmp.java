package com.demo.beans;

import java.util.Date;

public class SalariedEmp extends Employee{
	private double sal;
	private double bonus;

	public SalariedEmp() {
		super();
		System.out.println("in default constructor of SalariedEmp class");
	}

	public SalariedEmp(String pname, Date dob, String dept, String desg, double sal) {
		super("s",pname,dob,dept,desg);
		System.out.println("in parameterized constructor of SalariedEmp class");
		this.sal = sal;
		this.bonus = sal*0.1;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	public double calBonus(float percentage) {
		bonus = sal*percentage/100;
		return bonus;
	}

	@Override
	public double calulateSal() {
		sal = sal + bonus;
		return sal;
	}

	@Override
	public String toString() {
		return "SalariedEmp [sal=" + sal + ", bonus=" + bonus + "]";
	}

}
