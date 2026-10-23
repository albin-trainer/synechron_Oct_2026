package com.example.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AccServiceImpl implements AccountService {
	@Autowired
	@Qualifier("acc")
  private AccRepo repo;
	
    public AccServiceImpl() {
		System.out.println("constructor of service");
	}
   // @Autowired
	public void setRepo(AccRepo repo) {
		System.out.println("setter ");
	this.repo = repo;
}
	public String credit(float amt) {
		return repo.deposit(amt);
	}

}
