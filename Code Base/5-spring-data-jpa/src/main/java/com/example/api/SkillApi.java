package com.example.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Skill;
import com.example.service.SkillService;

@RestController
@RequestMapping("/skills")
public class SkillApi {
	@Autowired
	private SkillService  skillService;
	@PostMapping
 public Skill addNewSkill(@RequestBody Skill skill) {
	 return skillService.addNewSkill(skill);
 }
}
