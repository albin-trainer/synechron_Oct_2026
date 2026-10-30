package com.example.secure.service;

import java.util.Locale;

import org.springframework.http.HttpStatus;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import com.example.secure.config.JwtUtils;
import com.example.secure.dto.AuthResponse;
import com.example.secure.dto.LoginRequest;
import com.example.secure.dto.RegisterRequest;
import com.example.secure.entity.AppUser;
import com.example.secure.repository.UserRepository;


@Service
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final AuthenticationManager authenticationManager;
    private final CustomUserDetailsService userDetailsService;
    private final JwtUtils jwtUtils;

    public AuthService(
            UserRepository userRepository,
            PasswordEncoder passwordEncoder,
            AuthenticationManager authenticationManager,
            CustomUserDetailsService userDetailsService,
            JwtUtils jwtUtils) {

        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
        this.authenticationManager = authenticationManager;
        this.userDetailsService = userDetailsService;
        this.jwtUtils = jwtUtils;
    }

    public String register(RegisterRequest request) {

        if (request.uname() == null
                || request.uname().isBlank()
                || request.password() == null
                || request.password().length() < 8
                || request.password().length() > 72
                || request.role() == null) {

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Username, password (8-72 characters), "
                    + "and role are required");
        }

        String uname = request.uname().trim();
        String role = request.role()
                .trim().toUpperCase(Locale.ROOT);

        if (uname.isBlank() || uname.length() > 100) {
            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Username must contain 1-100 characters");
        }

        if (!role.equals("USER")) {
            throw new ResponseStatusException(
                    HttpStatus.FORBIDDEN,
                    "Public registration only allows USER role");
        }

        if (userRepository.existsByUname(uname)) {
            throw new ResponseStatusException(
                    HttpStatus.CONFLICT,
                    "Username already exists");
        }

        AppUser user = new AppUser(
                uname,
                passwordEncoder.encode(request.password()),
                role);

        userRepository.save(user);

        return "Registration successful";
    }

    public AuthResponse login(LoginRequest request) {

        if (request.uname() == null
                || request.uname().isBlank()
                || request.password() == null) {

            throw new ResponseStatusException(
                    HttpStatus.BAD_REQUEST,
                    "Username and password are required");
        }

        // Authenticate username and password
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.uname(),
                        request.password()));

        // Load the authenticated user's details
        UserDetails userDetails =
                userDetailsService.loadUserByUsername(
                        request.uname());

        AppUser user = userRepository.findByUname(
                request.uname()).orElseThrow();

        String token = jwtUtils.generateToken(
                userDetails, user.getRole());

        return new AuthResponse(
                token,
                "Bearer",
                user.getUname(),
                user.getRole());
    }
}