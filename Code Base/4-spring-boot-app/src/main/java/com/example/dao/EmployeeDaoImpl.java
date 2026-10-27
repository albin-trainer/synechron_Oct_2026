package com.example.dao;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import com.example.model.Employee;
@Component
public class EmployeeDaoImpl  implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public Employee addEmp(Employee e) {
		String sql = """
	            INSERT INTO emp (id, ename,address, salary)
	            VALUES (?, ?, ?,?)
	            """;

	        jdbcTemplate.update(
	            sql,
	            e.getEmpId(),
	            e.getEmpName(),
	           e.getAddress(),
	           e.getSalary()
	           );
	        return e;
	        
	}
}
