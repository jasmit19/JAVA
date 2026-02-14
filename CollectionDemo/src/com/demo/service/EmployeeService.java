package com.demo.service;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeService {

	boolean addNewEmployee();

	List<Employee> displayAll();

	Employee searchById(int id);

	List<Employee> searchByName(String name);

	boolean deleteById(int id);

	boolean updateByID(int id, double sal);

	boolean deleteBySalary(double sal);

	List<Employee> searchBySal(double sal);




}
