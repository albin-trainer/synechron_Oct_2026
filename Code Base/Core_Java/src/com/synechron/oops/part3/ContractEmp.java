package com.synechron.oops.part3;

public class ContractEmp extends Employee {
private float paymentPerDay;
private int noOfDays;
public ContractEmp(int empId, String empName, String address, float paymentPerDay, int noOfDays) {
	super(empId, empName, address);
	this.paymentPerDay = paymentPerDay;
	this.noOfDays = noOfDays;
}
void processSalary() {
	float totalSal=paymentPerDay*noOfDays;
	System.out.println("Total payment of contract emp is "+totalSal);
}


}
