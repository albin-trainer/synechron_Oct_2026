package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Skill;
import com.example.repo.SkillRepository;
@Service
public class SkillServiceImpl implements SkillService {
	@Autowired
	private SkillRepository skillRepo;
	public Skill addNewSkill(Skill s) {
		return skillRepo.save(s);
	}

}
