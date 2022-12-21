package com.practice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Employee;
import com.practice.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping
	public Employee addEmp(@RequestBody Employee emp) {
		return employeeService.save(emp);
	}
	
	@GetMapping
	public Employee getEmp(@RequestParam int id) {
		return employeeService.getEmp(id);
	}
	
	@DeleteMapping
	public String delete(@RequestParam int id) {
		return employeeService.deleteEmp(id);
	}

	@PutMapping
	public Employee update(@RequestBody Employee emp) {
		return employeeService.update(emp);
	}
}
