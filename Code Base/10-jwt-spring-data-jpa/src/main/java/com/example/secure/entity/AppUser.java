package com.example.secure.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "app_users")
public class AppUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true)
    private String uname;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String role;

    public AppUser() {
    }

    public AppUser(String uname, String password, String role) {
        this.uname = uname;
        this.password = password;
        this.role = role;
    }

    public Long getId() {
        return id;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}