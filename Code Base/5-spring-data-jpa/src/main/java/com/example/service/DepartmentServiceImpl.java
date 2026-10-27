package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Department;
import com.example.repo.DepartmentRepo;
@Service
public class DepartmentServiceImpl implements DepartmentService {
	@Autowired
private DepartmentRepo deptRepo;
	@Override
	public Department addNewDepartment(Department d) {
		return deptRepo.save(d);
	}

}
