package com.sst.project.service;

import java.util.List;

import com.sst.project.entity.Employee;

public interface EmployeeService {

	Employee saveEmployee(Employee employee);
	
	List<Employee> getAllEmployee();
	
	Employee getEmployeeById(long id);
	
	String deleteEmployeeById(long id);
}
