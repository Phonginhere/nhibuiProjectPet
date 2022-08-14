package com.example.layoutadmin;

import java.io.Serializable;

public class Users implements Serializable {
    private String email;
    private String role;

    public Users() {
    }

    public Users(String email, String role) {
        this.email = email;
        this.role = role;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
