package com.example.secure.controller;

import java.util.Map;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DemoController {

    @GetMapping("/hello")
    public Map<String, String> hello(
            Authentication authentication) {

        return Map.of(
                "message", "JWT authentication successful",
                "username", authentication.getName());
    }

    @GetMapping("/admin/dashboard")
    public Map<String, String> adminDashboard(
            Authentication authentication) {

        return Map.of(
                "message", "Welcome to admin dashboard",
                "username", authentication.getName());
    }
}