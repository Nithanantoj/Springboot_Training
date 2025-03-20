package com.example.anto.controller;

import com.example.anto.entity.User;

import com.example.anto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class HelloController {
    @Autowired
    UserService user;

    @GetMapping("/hello")
    public String sayHello() {
        return user.sayAnto();
    }

    @PostMapping("/create")
    public User UserCreation(@RequestBody User user1) {
        return user.UserCreation(user1);
    }

    @GetMapping("/getAll")
    public List<User> getAll() {
        return user.getAll();
    }

    @PutMapping("/update")
    public String updateUser(@RequestBody User updatedUser) {
        return user.updateUser(updatedUser);
    }

    @DeleteMapping("/delete/{rollno}")
    public String deleteUser(@PathVariable long rollno) {
        return user.deleteUser(rollno);
    }

}
