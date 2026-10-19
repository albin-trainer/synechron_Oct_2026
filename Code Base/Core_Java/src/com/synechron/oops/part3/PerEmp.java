package com.synechron.oops.part3;
//here v have 2 problmens
//1 override abstract method
public class PerEmp  extends Employee{
	private float pf;
	private float hra;
	private float basicSalary;
	public PerEmp(int empId, String empName, String address, float pf, float hra, float basicSalary) {
		super(empId, empName, address);
		this.pf = pf;
		this.hra = hra;
		this.basicSalary = basicSalary;
	}

	void processSalary(){
		float totalSal=pf+hra+basicSalary;
		System.out.println("total sal for per emp is "+totalSal);
	}
}
