package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.Organizer;
import com.example.eventbooking.Models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrganizerRepository extends MongoRepository<Organizer, Long> {

    boolean existsByEmail(String email);
    Organizer findByEmail(String email);

}