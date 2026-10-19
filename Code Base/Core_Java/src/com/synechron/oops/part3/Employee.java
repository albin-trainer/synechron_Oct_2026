package com.synechron.oops.part3;
public abstract class Employee {
private int empId;
private String empName;
private String address;
public Employee(int empId, String empName, String address) {
	this.empId = empId;
	this.empName = empName;
	this.address = address;
}
abstract void processSalary();
}
