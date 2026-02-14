package com.demo.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.demo.beans.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	static List<Employee> elist;
	
	static {
		elist=new ArrayList<>();
		elist.add(new Employee(100,"Manjiri",45678,LocalDate.of(2024, 11, 12)));
		elist.add(new Employee(101,"Ganeshh",72456,LocalDate.of(2025, 02, 05)));
		elist.add(new Employee(102,"Kanchan",35678,LocalDate.of(2020, 11, 12)));
	}

	@Override
	public boolean save(Employee e) {
		elist.add(e);
		return true;
	}

	@Override
	public List<Employee> findAll() {
		return elist;
	}

	@Override
	public Employee findById(int id) {
		//indexOf calls equals method internally 
		//equals method is written in employee class
		int pos=elist.indexOf(id);
		if(pos>0)
			return elist.get(pos);
		return null;
	}

	@Override
	public List<Employee> findByName(String name) {
		/* List<Employee> temp=new ArrayList<>();
		for(Employee e:elist) {
			if(e.getEname().equals(name)) {
				temp.add(e);
			}
		} */
		List<Employee> temp=elist.stream()
								 .filter(emp->emp.getEname().equals(name))
								 .collect(Collectors.toList());
		if(temp.size()>0) {
			return temp;
		}
		return null;
		
	}

	@Override
	public boolean removeById(int id) {
		//remove calls equals method internally 
		//equals method is written in employee class
		return elist.remove(new Employee(id));
	}

	@Override
	public boolean modifyById(int id, double sal) {
		int pos=elist.indexOf(new Employee(id));
		if(pos>0) {
			Employee e=elist.get(pos);
			e.setSal(sal);
			return true;
		}			
		return false;
	}
	
	@Override
	public boolean removeBySalary(double sal) {
		return elist.removeIf(emp->emp.getSal()>sal);
	}

	@Override
	public List<Employee> findBySal(double sal) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
