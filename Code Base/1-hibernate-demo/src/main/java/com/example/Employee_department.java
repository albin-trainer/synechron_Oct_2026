package com.example;

import java.awt.datatransfer.Transferable;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Department;
import com.example.entity.Employee;

public class Employee_department {
	static SessionFactory sesFact=new Configuration().
			configure().buildSessionFactory();
public static void main(String[] args) {
	//addDepartment();
	Employee e=new Employee();
	e.setEmpId(1);
	e.setEmpName("Kevin");
	e.setAddress("New Delhi");
	e.setEmail("kevin@abcd.com");
	e.setSalary(100000);
	addNewEmployee(e, 90001);
	
}
static void addNewEmployee(Employee e,  int deptId){
	Session session=sesFact.openSession();
	Transaction t=session.beginTransaction();
	Department d=session.get(Department.class, deptId);
	if(d!=null) {
		e.setDept(d); //mapping is happening here 
		session.save(e);
		t.commit();
		System.out.println("Emp added");
	}
	else System.out.println("Incorrect dept");
	session.close();
}
static void addDepartment() {
	Department d=new Department();
	d.setDeptId(90001);
	d.setDeptName("SEED");
	Session session=sesFact.openSession();
	Transaction t=session.beginTransaction();
	session.save(d);
	t.commit();
	session.close();
	System.out.println("Department added");
}
}
