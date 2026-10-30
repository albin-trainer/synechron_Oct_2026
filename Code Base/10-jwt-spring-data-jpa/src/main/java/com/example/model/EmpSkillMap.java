package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class EmpSkillMap {
	@Id
	@GeneratedValue
private int id;
	@ManyToOne
	@JoinColumn(name="empId")//optional
private Employee employee;
	
	@ManyToOne
	@JoinColumn(name="skillId")
private Skill skill;
private int ratings;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public Employee getEmployee() {
	return employee;
}
public void setEmployee(Employee employee) {
	this.employee = employee;
}
public Skill getSkill() {
	return skill;
}
public void setSkill(Skill skill) {
	this.skill = skill;
}
public int getRatings() {
	return ratings;
}
public void setRatings(int ratings) {
	this.ratings = ratings;
}

}
