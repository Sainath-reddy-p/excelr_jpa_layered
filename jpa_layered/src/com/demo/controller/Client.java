package com.demo.controller;

import com.demo.model.Employee;
import com.demo.service.EmployeeService;
import com.demo.service.EmployeeServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EmployeeService service = new EmployeeServiceImpl();
		
		//creating employee obj to insert data into db
		Employee emp = new Employee(123,"sainath",90000.00, "hyd");
		
		service.addEmployee(emp);
		
		//Employee employee = service.findByEmployeeId(123);
		//System.out.println(employee);
		
		//employee.setEmpsal(500000.00);
		//employee.setEmpadd("Hyderabad");
		
		//to update employee data
		//service.updateEmployee(employee);
		
		//to delete the data in the table
		//service.deleteEmployee(employee);
		
	}

}
