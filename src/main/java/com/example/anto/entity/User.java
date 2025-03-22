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
    private String password;

    public User(){}

    public User(int rollno, String name, String email) {
        this.name = name;
        this.rollno = rollno;
        this.email = email;
        this.password = password;

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

    public String getPassword() {
        return password;
    }

}

