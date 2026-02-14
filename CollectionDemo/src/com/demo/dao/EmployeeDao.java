package com.demo.dao;

import java.util.List;

import com.demo.beans.Employee;

public interface EmployeeDao {

	boolean save(Employee e);

	List<Employee> findAll();

	Employee findById(int id);

	List<Employee> findByName(String name);

	boolean removeById(int id);

	boolean modifyById(int id, double sal);

	boolean removeBySalary(double sal);

	List<Employee> findBySal(double sal);


}
