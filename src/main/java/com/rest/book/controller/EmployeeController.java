package com.rest.book.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.book.entities.Employee;
import com.rest.book.services.EmployeeService;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add")
	public Employee addEmployee(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployee(employee);
	}
	

}
