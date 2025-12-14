package com.demo.beans;

import java.util.Date;

//Employee is an abstract class
//You CANNOT create an object like:
//Employee e = new Employee(); // ❌ Not allowed

abstract public class Employee extends Person{
	private String dept;
	private String desg;
	
	//Employee extends Person
	//Employee inherits: pid, pname, bdate, ID generation logic, getters/setters, toString
	//Employee adds new fields (dept, desg) and new behavior
	
	
	public Employee() {
		//super();----------Calls default constructor of Person
		//That constructor prints:--------in default constructor of Person
		//Generates ID, sets pname=null, bdate=null
		
		//Then Employee prints:-----------in default constructor of Employee
		super();
		System.out.println("in default constructor of Employee");
	}

	//Employee adds new fields (dept, desg) and new behavior	
	//Employee e = new PermanentEmployee("s", "Amit", date, "IT", "Developer");
	
	public Employee(String emptype, String pname, Date bdate, String dept, String desg) {
		//pass the parameters from Parent class
		super(emptype,pname,bdate);
		System.out.println("in parameterized constructor of Employee");
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
	
	//create an abstract which must be inherited by it's child class
	//this forces every subclass (child class) to implement salary calculation
	abstract public double calculateSal();

	
	//Calls super.toString() → Person’s string output:-------Person [pid=s1, pname=Amit, bdate=10/01/2000]
	//Then adds Employee info:-----------Employee [dept=IT, desg=Developer]
	//Final Output:----------Person [pid=s1, pname=Amit, bdate=10/01/2000]Employee [dept=IT, desg=Developer]

	@Override
	public String toString() {
		return super.toString()+"Employee [dept=" + dept + ", desg=" + desg + "]";
	}
	
	
}
