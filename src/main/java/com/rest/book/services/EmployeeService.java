package com.rest.book.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.book.dao.EmployeeRepository;
import com.rest.book.entities.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository  employeeRepository;
	
	public Employee addEmployee(Employee employee)
	{
		return this.employeeRepository.save(employee);
	}

}
