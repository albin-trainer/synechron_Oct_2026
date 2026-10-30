package com.example.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
