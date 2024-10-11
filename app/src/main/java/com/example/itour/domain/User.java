package com.example.itour.domain;

public class User {

    private String UUID;
    private String name;
    private String email;
    private String password;
    private String phone;

    public User() {
    }

    public User(String UUID, String name, String email, String password, String phone) {
        this.UUID = UUID;
        this.name = name;
        this.email = email;
        this.password = password;
        this.phone = phone;
    }

    public String getUUID() {
        return UUID;
    }

    public void setUUID(String UUID) {
        this.UUID = UUID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
