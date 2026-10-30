package com.example.secure.dto;

public record RegisterRequest(
        String uname,
        String password,
        String role) {
}