package com.example.demo.model;

import java.util.List;

public class User {

    private String password;
    private List<Authorities> authorities;

    public User(String password, List<Authorities> authorities) {
        this.password = password;
        this.authorities = authorities;
    }

    public String getPassword() {
        return password;
    }

    public List<Authorities> getAuthorities() {
        return authorities;
    }
}
