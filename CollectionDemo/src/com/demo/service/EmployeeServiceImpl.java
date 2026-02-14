package com.demo.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import com.demo.beans.Employee;
import com.demo.dao.EmployeeDao;
import com.demo.dao.EmployeeDaoImpl;

public class EmployeeServiceImpl implements EmployeeService {
	private EmployeeDao edao;
	Scanner sc=new Scanner(System.in);

	public EmployeeServiceImpl() {
		edao=new EmployeeDaoImpl();
	}
	
	@Override
	public boolean addNewEmployee() {
		
		System.out.println("enter employee id");
		int eid=sc.nextInt();
		System.out.println("enter employee name");
		String name=sc.next();
		System.out.println("enter Employee salary");
		double sal=sc.nextDouble();
		System.out.println("enter joining date");
		String doj=sc.next();
		LocalDate ldt=LocalDate.parse(doj, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		Employee e=new Employee(eid,name,sal,ldt);		
		return edao.save(e);
	}

	@Override
	public List<Employee> displayAll() {
		return edao.findAll();
	}

	@Override
	public Employee searchById(int id) {
		// TODO Auto-generated method stub
		return edao.findById(id);
	}

	@Override
	public List<Employee> searchByName(String name) {
		// TODO Auto-generated method stub
		return edao.findByName(name);
	}


	@Override
	public boolean deleteById(int id) {
		// TODO Auto-generated method stub
		return edao.removeById(id);
	}

	@Override
	public boolean updateByID(int id, double sal) {
		// TODO Auto-generated method stub
		return edao.modifyById(id,sal);
	}

	@Override
	public boolean deleteBySalary(double sal) {
		// TODO Auto-generated method stub
		return edao.removeBySalary(sal);
	}

	@Override
	public List<Employee> searchBySal(double sal) {
		// TODO Auto-generated method stub
		return edao.findBySal(sal);
	}

}
