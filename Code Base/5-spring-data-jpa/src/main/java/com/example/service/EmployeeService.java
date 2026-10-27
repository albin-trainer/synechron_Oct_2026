package com.example.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestBody;

import com.example.dto.EmpSkillDto;
import com.example.model.EmpSkillMap;
import com.example.model.Employee;
import com.example.model.Skill;

public interface EmployeeService {
	public Employee addEmployee( Employee e);
	public Employee searchEmployeeById(int id);
	public List<Employee> allEmps();
	public List<Employee> searchByAddress(String address);
	public EmpSkillMap updateSkill( EmpSkillDto empSkillDto);
}