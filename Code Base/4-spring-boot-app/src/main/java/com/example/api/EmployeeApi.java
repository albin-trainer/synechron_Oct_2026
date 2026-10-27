package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.EmployeeDao;
import com.example.model.Employee;

@RestController
@RequestMapping("/employees")
public class EmployeeApi {
	@Autowired
	private EmployeeDao empDao;
	@GetMapping("/test")
	public Employee test() {
		Employee emp=new Employee(1,"Sanjay","Mumbai",50000);
		return emp;
	}
	@PostMapping
	public Employee addNewEmployee(@RequestBody Employee e) {
	empDao.addEmp(e);
		return e;
	}
}
