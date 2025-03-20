package com.example.anto.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "users")
public class User {
    @Id
    private int rollno;
    private String name;
    private String email;

    public User(){}

    public User(int rollno, String name, String email) {
        this.name = name;
        this.rollno = rollno;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getRollno() {
        return rollno;
    }

}

