package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.EventUser;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface EventUserRepository extends MongoRepository<EventUser, Long> {

//    EventUser findEventUserByEventIdAndUserId(Long idEvent,Long idUser);

//    List<EventUser> findEventUserByUserId(Long id);
}