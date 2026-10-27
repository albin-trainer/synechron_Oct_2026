package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Department;
import com.example.service.DepartmentService;

@RestController
@RequestMapping("/departments")
public class DepartmentApi {
	@Autowired
	private DepartmentService departmentService;
	@PostMapping
public Department addDepartment(@RequestBody  Department d) {
	return departmentService.addNewDepartment(d);
}
}
