package com.example.bean;
public class AccRepoImpl implements AccRepo {
	public AccRepoImpl() {
		System.out.println("constructor of accrep");
	}
	
	@Override
	public String deposit(float amt) {
		return "The amt of "+amt+" deposited in ur acc";
	}

}
