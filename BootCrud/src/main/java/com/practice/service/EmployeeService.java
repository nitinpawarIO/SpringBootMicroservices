package com.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Employee;
import com.practice.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	public Employee getEmp(int id) {
		return employeeRepository.findById(id).get();
	}
	
	public String deleteEmp(int id) {
		employeeRepository.deleteById(id);;
		return "Employee Deleted : "+id;
	}
	
	public Employee update(Employee emp) {
		Employee entity = employeeRepository.findById(emp.getId()).get();
		entity.setName(emp.getName());
		entity.setAge(emp.getAge());
		return employeeRepository.save(emp);
	}

}
