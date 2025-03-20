package com.example.anto.repository;

import com.example.anto.entity.User;

//import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;
//
//@Repository
//public interface UserRepository extends MongoRepository<User, String> {
//    // Custom queries if needed
//}

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    // Custom queries if needed
}


