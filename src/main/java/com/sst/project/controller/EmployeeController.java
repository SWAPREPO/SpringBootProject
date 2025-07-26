package com.sst.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sst.project.entity.Employee;
import com.sst.project.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService employeeService;
	
	@PostMapping("/add-employee")
	public Employee saveEmployee(@RequestBody Employee employee) {
		return employeeService.saveEmployee(employee);
	}
	
	@GetMapping("/get-all-employee")
	public List<Employee> getAllEmployee() {
		return employeeService.getAllEmployee();
	}
	
	@GetMapping("/get-employee-by-id/{id}")
	public Employee getAllEmployee(@PathVariable("id") Long id) {
		return employeeService.getEmployeeById(id);
	}
	
	@DeleteMapping("/delete-employee-by-id/{id}")
	public String deleteAllEmployee(@PathVariable("id") Long id) {
		return employeeService.deleteEmployeeById(id);
	}
	
	public ResponseEntity<Employee> displayEmployeeForm(Model model) {
		return null;
	}
}
