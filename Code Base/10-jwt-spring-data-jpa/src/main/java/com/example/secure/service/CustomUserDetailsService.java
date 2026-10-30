package com.example.secure.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.secure.entity.AppUser;
import com.example.secure.repository.UserRepository;


@Service
public class CustomUserDetailsService
        implements UserDetailsService {

    private final UserRepository userRepository;

    public CustomUserDetailsService(
            UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String uname)
            throws UsernameNotFoundException {

        AppUser user = userRepository.findByUname(uname)
                .orElseThrow(() ->
                        new UsernameNotFoundException(
                                "User not found"));

        return User.withUsername(user.getUname())
                .password(user.getPassword())
                .roles(user.getRole())
                .build();
    }
}