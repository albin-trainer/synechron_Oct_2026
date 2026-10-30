package com.example.secure.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.secure.entity.AppUser;


public interface UserRepository
        extends JpaRepository<AppUser, Long> {

    Optional<AppUser> findByUname(String uname);

    boolean existsByUname(String uname);
}