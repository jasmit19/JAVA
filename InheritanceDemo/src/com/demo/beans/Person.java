//This line tells Java that the class belongs to the package com.demo.beans.
//Packages help organize classes into folders.

package com.demo.beans;

//Date → To store a date of birth or any date.
//SimpleDateFormat → To convert Date into a readable string like "25/12/2024"

import java.text.SimpleDateFormat;
import java.util.Date;

public class Person {
	//These are static counters used to generate IDs
	
	static int scount, vcount, ccount;
	
	//Static means: Belongs to the class, not to objects.
	//Shared by all objects.
	
	//This block is executed only once when the class is loaded into memory.
	//It initializes all counters to 0.
	static {
		scount=0;
		ccount=0;
		vcount=0;
	}
	
	//They are private, so accessible only inside this class
	private String pid;
	private String pname;
	private Date bdate;
	
	
	public Person() {
		System.out.println("in default constructor of Person");
		
		//pid is set using generateId("s") -> Means default category = “s”
		//scount increases
		//pid = "s" + scount-----------Example: s1, s2, s3…
		this.pid=generateId("s");		//pid → unique id of a person
		this.pname=null;
		this.bdate=null;				
	}
	
	//Person p = new Person("v", "Amit", "19/03/2003");
	
	public Person(String emptype, String pname, Date bdate) {
		System.out.println("in parameterized constructor of Person");
		
		//ID will be generated based on emptype---------If emptype = "c", id = c1, c2, c3…
		this.pid = generateId(emptype);		//emptype can be "s", "c", or "v"
		this.pname = pname;
		this.bdate = bdate;
	}
	
	private String generateId(String emptype) {
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
		return null;
	}
	
	//since we are setting pid ourselves, so pid setter method should be deleted
	
	public String getPid() {
		return pid;
	}
	
	/*public void setPid(String pid) {
		this.pid = pid;
	}*/
	
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	
	@Override
	public String toString() {
		
		//we want to display date in normal simple form, not Date or LocalDate
		//SimpleDateFormat is a predefined class in Java
		//then we are converting into String format (for displaying) 
		//by passing our default Date(bdate) variable in .(format) method through object sdf
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String str=sdf.format(bdate);
		return "Person [pid=" + pid + ", pname=" + pname + ", bdate=" + str + "]";
	}
	
	
}
