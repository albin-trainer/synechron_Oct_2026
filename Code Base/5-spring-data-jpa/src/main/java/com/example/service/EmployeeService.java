package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.model.Employee;

public interface EmployeeService {
	public Employee addEmployee( Employee e);
	public Employee searchEmployeeById(int id);
	public List<Employee> allEmps();
}
