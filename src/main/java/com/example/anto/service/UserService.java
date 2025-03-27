package com.example.anto.service;

import com.example.anto.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.anto.entity.User;
import java.util.List;
//import java.util.ArrayList;



@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

//    private  List<User> users= new ArrayList<>();



    public String sayAnto() {
        return "Hello, anto!";
    }


    public User UserCreation(User user) {
        return userRepo.save(user);
    }



    public List<User> getAll() {
        return userRepo.findAll();
    }


    public String updateUser(User user) {
        userRepo.save(user);
        return "User updated successfully";
    }



    public String deleteUser(long rollno) {
        if (userRepo.existsById(rollno)) {
            userRepo.deleteById(rollno);
            return "User deleted successfully";
        } else {
            return "User not found";
        }
    }


    public User findByName(String name) {
        return userRepo.findByName(name);
    }

    public User findByNameAndEmail(String name, String email) {
        User byNameAndEmail = userRepo.findByNameAndEmail(name, email);
        return byNameAndEmail;
    }
}
