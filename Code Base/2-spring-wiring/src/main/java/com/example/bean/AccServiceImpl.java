package com.example.bean;
public class AccServiceImpl implements AccountService {
  private AccRepo repo;
    public AccServiceImpl() {
		System.out.println("constructor of service");
	}
	public void setRepo(AccRepo repo) {
		System.out.println("setter ");
	this.repo = repo;
}
	public String credit(float amt) {
		return repo.deposit(amt);
	}

}
