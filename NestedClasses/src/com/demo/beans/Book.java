package com.demo.beans;

public class Book {
	private int bid;
	private String bname;
	private Lesson l1;
	
	//Lesson is a Non-static Inner class of Book
	class Lesson{
		private int lid;
		private String lname;
		
		public Lesson() {
			this.lid = 0;
			this.lname = null;
		}
		public Lesson(int id, String name) {
			super();
			this.lid = id;
			this.lname = name;
		}
		
		public void m1() {
			System.out.println("in m1 method of the Lesson class");
		}
	}

	public Book() {
		this.bid = 0;
		this.bname = null;
		this.l1 = null;
	}

	public Book(int bid, String bname, int id, String name) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.l1 = new Lesson(id, name);
	}

	public Lesson getL1() {
		return l1;
	}

	public void setL1(Lesson l1) {
		this.l1 = l1;
	}

	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", l1=" + l1 + "]";
	}

}
