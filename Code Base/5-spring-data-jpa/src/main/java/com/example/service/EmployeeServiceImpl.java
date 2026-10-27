package com.example.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.model.Employee;
import com.example.repo.EmployeeRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	@Override
	public Employee addEmployee(Employee e) {
		return empRepo.save(e);
	}

	@Override
	public Employee searchEmployeeById(int id) {
	  Optional<Employee>optional= empRepo.findById(id);
	  if(optional.isPresent())
		   return optional.get();
		return null;
	}

	@Override
	public List<Employee> allEmps() {
		return empRepo.findAll();
	}

}
