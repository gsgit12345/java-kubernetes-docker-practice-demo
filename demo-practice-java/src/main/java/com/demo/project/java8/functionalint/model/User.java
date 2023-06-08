package com.demo.project.java8.functionalint.model;

public class User {
    public User(String name, String role) {
        this.name = name;
        this.role=role;
    }

    String name;

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    String role;

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


}
