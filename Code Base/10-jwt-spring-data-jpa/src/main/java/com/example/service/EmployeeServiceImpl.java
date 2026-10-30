package com.example.service;

import com.example.api.EmployeeApi;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.dto.EmpSkillDto;
import com.example.exceptions.ApplicationException;
import com.example.model.EmpSkillMap;
import com.example.model.Employee;
import com.example.model.Skill;
import com.example.repo.EmpSkillMapRepo;
import com.example.repo.EmployeeRepository;
import com.example.repo.SkillRepository;
@Component
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeRepository empRepo;
	@Autowired
	private SkillRepository skillRepo;
	@Autowired
	private EmpSkillMapRepo  empSkillMapRepo;

	@Override
	public Employee addEmployee(Employee e) {
		return empRepo.save(e); //add new and update
	}
	public Employee searchEmployeeById(int id) {
	  Optional<Employee>optional= empRepo.findById(id);
	  if(optional.isPresent())
		   return optional.get();
		throw new ApplicationException("employee id "+id+"  not  found");
	}
	public List<Employee> allEmps() {
		return empRepo.findAll();
	}
	@Override
	public List<Employee> searchByAddress(String address) {
		return empRepo.findByAddress(address);
	}
	@Override
	public EmpSkillMap updateSkill(EmpSkillDto empSkillDto) {
		int empId=empSkillDto.getEmpId();
		int skillId=empSkillDto.getSkillId();
		Employee emp=empRepo.findById(empId)
		.orElseThrow(()-> new ApplicationException("employee id "+empId+"  not  found"));
		Skill skill=skillRepo.findById(skillId)
				.orElseThrow(()-> new ApplicationException("skill id "+skillId+"  not  found"));
		EmpSkillMap empSkill=new EmpSkillMap();
		empSkill.setEmployee(emp);
		empSkill.setSkill(skill);
		empSkill.setRatings(empSkillDto.getRatings());
		EmpSkillMap skillMap= empSkillMapRepo.save(empSkill);
		return skillMap;
	}

}
