package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.Venue;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface VenueRepository extends MongoRepository<Venue, Long> {

    Venue findTopByOrderByIdDesc();
}