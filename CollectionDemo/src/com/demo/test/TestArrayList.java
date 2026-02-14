package com.demo.test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;

import com.demo.beans.Employee;

public class TestArrayList {

	public static void main(String[] args) {
		List<Employee> elist=new ArrayList<>();
		elist.add(new Employee(11,"Jasmit",12567.24,LocalDate.of(2026, 03, 19)));
		elist.add(new Employee(12,"Ganesh",75423.61,LocalDate.of(2024, 11, 26)));
		elist.add(new Employee(13,"Jayesh",78564.34,LocalDate.of(2025, 12, 05)));
		
		for(int i=0;i<elist.size();i++) {
			System.out.println(elist.get(i));
		}
		System.out.println("---------------->");
		for(Employee e:elist){
			System.out.println(e);
		}
		System.out.println("---------------->");
		//it is a directional iterator
		Iterator<Employee> it=elist.iterator();
		while(it.hasNext()) {
			Employee e=it.next();
			System.out.println(e);
		}
		System.out.println("---------------->");
		
		// it is a bidirectional iterator
		ListIterator<Employee> it1=elist.listIterator();
		
		elist.forEach(System.out::println);
		System.out.println("---------------->");
		
		//search by id
		int id=13;
		Optional<Employee> op=elist.stream().filter(emp->emp.getEmpid()==id).findFirst();
		if(op.isPresent()) {
			System.out.println(op.get());
		}else {
			System.out.println("not found");
		}				
	}
}
