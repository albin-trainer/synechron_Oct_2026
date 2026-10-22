package com.example;

import java.awt.datatransfer.Transferable;
import java.util.ArrayList;
import java.util.List;

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
//	Employee e=new Employee();
//	e.setEmpId(3);
//	e.setEmpName("Garv");
//	e.setAddress("Bangalore");
//	e.setEmail("garv@abcd.com");
//	e.setSalary(100000);
//	addNewEmployee(e, 90001);
//	getDepartmenById(90001);
	addDeptWithEmps();
}
private static void addDeptWithEmps() {
	Department d=new Department();
	d.setDeptId(9002);
	d.setDeptName("IT");
	
	Employee e1=new Employee();
	e1.setEmpId(4);
	e1.setEmpName("Sunny");
	e1.setAddress("Bangalore");
	e1.setEmail("Sunny@abcd.com");
	e1.setSalary(100000);
	e1.setDept(d);
	Employee e2=new Employee();
	e2.setEmpId(5);
	e2.setEmpName("Sai");
	e2.setAddress("Bangalore");
	e2.setEmail("sai@abcd.com");
	e2.setSalary(100000);
	e2.setDept(d);
	List<Employee> emps= new ArrayList<>();
	emps.add(e1);emps.add(e2);
	d.setEmployees(emps);
	Session session=sesFact.openSession();
	Transaction t=session.beginTransaction();
	session.save(d);
	t.commit();
	session.close();
	System.out.println("Department added");
	
	
}
static void getDepartmenById(int deptId) {
	Session session=sesFact.openSession();
	Department d=session.get(Department.class, deptId); //select query
	if(d!=null) {
		System.out.println("Department name  is"
				+ " "+d.getDeptName());
		//returns proxy object
		List<Employee> emps=d.getEmployees();
		System.out.println("*************");
		System.out.println("No of emps is "+emps.size());
		
	}
	else System.out.println("department not found");
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
