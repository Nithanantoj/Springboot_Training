package com.example.anto.controller;

import com.example.anto.entity.User;

import com.example.anto.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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
    public ResponseEntity<String> deleteUser(@PathVariable long rollno) {
        String result = user.deleteUser(rollno);
        if (result.equals("User deleted successfully")) {
            return ResponseEntity.ok(result); // 200 OK
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(result); // 404 Not Found
        }
    }


    @GetMapping("/name/{name}")
    public User getUserByName(@PathVariable String name) {
        return user.findByName(name);
    }

    @GetMapping("/nameandemail")
    public User getUserByNameAndEmail(@RequestParam String name, @RequestParam String email) {
        return user.findByNameAndEmail(name,email);
    }



}
