package com.sst.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sst.project.entity.Employee;
import com.sst.project.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployee() {
		return (List<Employee>) employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		if(employeeRepository.findById(id).isPresent()) {
			return employeeRepository.findById(id).get();
		} else {
			System.err.println("Employee with id <" + id + "> does not exist..");
			//Handle Exception here
		}
		return null;
	}

	@Override
	public String deleteEmployeeById(long id) {
		String msg = "";
		if(employeeRepository.findById(id).isPresent()) {
			employeeRepository.deleteById(id);
			msg = "Employee with id <" + id + "> is deleted.";
		} else {
			msg = "Employee with id <" + id + "> does not exist hence can not delete it.";
			System.err.println(msg);
		}
		return msg;
	}
}
