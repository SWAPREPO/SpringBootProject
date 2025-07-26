package com.sst.project.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sst.project.entity.Employee;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	public ResponseEntity<Employee> displayEmployeeForm(Model model) {
		return null;
	}
}
