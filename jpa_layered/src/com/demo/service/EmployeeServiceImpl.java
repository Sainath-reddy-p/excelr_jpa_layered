package com.demo.service;

import com.demo.dao.EmployeeDAO;
import com.demo.dao.EmployeeDAOImpl;
import com.demo.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	// creating object(dao) in service
	EmployeeDAO dao;

	public EmployeeServiceImpl() {
		dao = new EmployeeDAOImpl();
	}

	@Override
	public void addEmployee(Employee emp) {
		dao.beginTransaction();
		dao.addEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void updateEmployee(Employee emp) {
		dao.beginTransaction();
		dao.updateEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public void deleteEmployee(Employee emp) {
		dao.beginTransaction();
		dao.deleteEmployee(emp);
		dao.commitTransaction();
	}

	@Override
	public Employee findByEmployeeId(int empid) {
		Employee findEmp = dao.getEmployeeById(empid);
		return findEmp;
	}

}
