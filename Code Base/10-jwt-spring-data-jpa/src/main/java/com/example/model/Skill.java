package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Skill {
	@Id
	@GeneratedValue
private int skillId;
private String skillName;
public int getSkillId() {
	return skillId;
}
public void setSkillId(int skillId) {
	this.skillId = skillId;
}
public String getSkillName() {
	return skillName;
}
public void setSkillName(String skillName) {
	this.skillName = skillName;
}

}
