package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {


    boolean existsByEmail(String email);
    User findByEmail(String email);
}