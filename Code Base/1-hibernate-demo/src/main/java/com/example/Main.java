package com.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.example.entity.Employee;

public class Main {
	///configure mthod automatically reads hibernate.cfg.xml file
	/// it creates the neccessary tables based on the Entity classes
	static SessionFactory sesFact=new Configuration().
			configure().buildSessionFactory();
	
public static void main(String[] args) {
	System.out.println("Hello, tables are created ");
	//addNewEmployee();
	//searchEmp(110);
//	updateAddress(1, "Bangalore");
}
static void updateAddress(int id, String address) {
	Session session=sesFact.openSession();
	Employee e= session.get(Employee.class,id); //search only by PK
	if(e!=null) {	
	Transaction t=session.beginTransaction();
	e.setAddress(address);
	t.commit();
	}
	else
		System.out.println("Emp record not found");
	session.close();
	}
static void searchEmp(int id) {
	Session session=sesFact.openSession();
	Employee e= session.get(Employee.class,id); //search only by PK
	if(e!=null) {		System.out.println(e.getEmpName()+" "+e.getSalary());
	}
	else
		System.out.println("Emp record not found");
	session.close();
}
static void addNewEmployee() {
	Employee e=new Employee(); //New or Transient state
	e.setEmpId(107);
	e.setEmpName("Srijan");
	e.setSalary(50000);
	e.setAddress("Jammu");
	Session session=sesFact.openSession(); //new DB connection create here
	Transaction t=   session.beginTransaction();
	session.save(e); //managed state
	e.setAddress("Bangalore and Jammu");
	t.commit();
	session.close(); //connection will get close
	e.setAddress("Pak");
	System.out.println("Saved in the DB");
	
	
}
}
