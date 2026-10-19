package com.synechron.oops.part3;

public class AbstractClassDemo {
public static void main(String[] args) {
	PerEmp emp1=new PerEmp(101, "Sanjay", "Mumbai", 5000, 6000, 50000);
	
	ContractEmp emp2=new ContractEmp(102, "Raj", "Pune", 10000, 5);
	
	Employee emps[]= {emp1,emp2};
	for(Employee e:emps) {
		payRollService(e);
	}
	
}
static void payRollService(Employee e) {
	e.processSalary();
}
}
