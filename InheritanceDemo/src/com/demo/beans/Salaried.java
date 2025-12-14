/*
This class represents a specific type of employee:
➡️ A Salaried Employee (meaning fixed monthly salary + bonus)
*/
//It extends the Employee class, which itself extends Person

package com.demo.beans;

import java.util.Date;


//So the inheritance chain is:		Person  →  Employee  →  Salaried
//It inherits:✔ name	✔ birthdate	✔ department	✔ designation	✔ abstract method calculateSal() (which Salaried MUST override)

public class Salaried extends Employee{
	//These variables are unique to salaried employees and are not present in the parent classes.
	private double sal;
	private double bonus;
	
	/*super() → Calls the default constructor of Employee
				Employee's constructor calls Person’s default constructor
	Then control comes back to this(Salaried) constructor
	Prints:--------in default constructor of Salaried*/
	public Salaried() {
		super();
		System.out.println("in default constructor of Salaried");
	}
	
	//jab hum Salaried employee k constructor ko call karenge, tab hum ko class k saare variables parameters mein pass nhi krne hai
	//kyuki bonus=sal*0.1
	//aur emptype Salaried class mein by default "s" rahenga
	public Salaried(String pname, Date bdate, String dept, String desg, double sal) {
		//pass the arguments from parent classes
		//Employee(String emptype, String pname, Date bdate, String dept, String desg)

		super("s",pname,bdate,dept,desg);
		System.out.println("in parameterized constructor of Salaried");
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

	//since Employee is abstract, Salaried MUST implement calculateSal()
	@Override
	public double calculateSal() {
		sal=sal+bonus;
		return sal;
	}

	@Override
	public String toString() {
		/*
		 Calls super.toString() → this prints Person + Employee details
		 Then adds this:--------- Salaried [sal=___, bonus=___]
		 */
		return super.toString()+"Salaried [sal=" + sal + ", bonus=" + bonus + "]";
	}
	
}
