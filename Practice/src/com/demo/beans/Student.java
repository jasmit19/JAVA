package com.demo.beans;

import java.time.LocalDate;

public class Student {
	private int id;
	private String name;
	private double m1;
	private float m2;
	private String bdate;
	private LocalDate ldt;
	public Student() {
		this.id = 0;
		this.name = null;
		this.m1 = 0.00d;
		this.m2 = 0.0f;
		this.bdate = null;
	}
	public Student(int id, String name, double m1, float m2, LocalDate ldt) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.ldt = ldt;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getM1() {
		return m1;
	}
	public void setM1(double m1) {
		this.m1 = m1;
	}
	public float getM2() {
		return m2;
	}
	public void setM2(float m2) {
		this.m2 = m2;
	}
	public String getBdate() {
		return bdate;
	}
	public void setBdate(String bdate) {
		this.bdate = bdate;
	}
	
	public void display() {
		System.out.println("id: "+this.id);
		System.out.println("name: "+this.name);
		System.out.println("m1: "+this.m1);
		System.out.println("m2: "+this.m2);
		System.out.println("date: "+this.bdate);
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", bdate=" + bdate + "]";
	}
	
	
}
