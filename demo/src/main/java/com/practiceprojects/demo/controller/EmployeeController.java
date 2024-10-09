package com.practiceprojects.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practiceprojects.demo.model.Employee;
import com.practiceprojects.demo.repository.EmployeeRepository;

@RestController
@RequestMapping(value = "/api/v1")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping(value = "/employees")
	public List<Employee> getAllEmployees(){
		return employeeRepository.findAll();
	}

}
