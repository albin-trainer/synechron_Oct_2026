package com.example.secure.dto;

public record LoginRequest(
        String uname,
        String password) {
}