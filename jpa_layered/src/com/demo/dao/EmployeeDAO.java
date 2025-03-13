package com.demo.dao;

import com.demo.model.Employee;

public interface EmployeeDAO {

	Employee getEmployeeById(int empid);
	
	void addEmployee(Employee emp);
	
	void updateEmployee(Employee emp);
	
	void deleteEmployee(Employee emp);
	
	void beginTransaction();
	
	void commitTransaction();
}
