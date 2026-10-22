package com.example.entity;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity //mandatory
@Table(name="employees") //optional
@DynamicUpdate//update only specific col
@DynamicInsert //null cols are omitted
public class Employee {
	@Id //mandatory
private int empId;
	@Column(name="ENAME",length = 20)
private String empName;
	@Column(unique = true, length = 25,nullable = false)//optional
private String email;
private float salary;
private String address;
@ManyToOne(fetch = FetchType.LAZY)
private Department dept;
public int getEmpId() {
	return empId;
}
public void setEmpId(int empId) {
	this.empId = empId;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Department getDept() {
	return dept;
}
public void setDept(Department dept) {
	this.dept = dept;
}



}
