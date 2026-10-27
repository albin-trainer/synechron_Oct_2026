package com.example.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Employee;
import com.example.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeApi {
	@Autowired
	private EmployeeService employeeService;
	@PostMapping
  public Employee addEmployee( @RequestBody Employee e) {
		Employee emp=employeeService.addEmployee(e);
	  return emp;
  }
	//URL : /employees/101
	@GetMapping("/{id}")
	public Employee searchEmployeeById(@PathVariable("id") int id) {
		return employeeService.searchEmployeeById(id);
	}
	@GetMapping
	public List<Employee> allEmps(){
		return employeeService.allEmps();
	}
}
