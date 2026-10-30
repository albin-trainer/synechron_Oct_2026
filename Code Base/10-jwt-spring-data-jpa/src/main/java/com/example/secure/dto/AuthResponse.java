package com.example.secure.dto;

public record AuthResponse(
        String token,
        String tokenType,
        String uname,
        String role) {
}