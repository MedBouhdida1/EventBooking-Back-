package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.EventUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventUserRepository extends JpaRepository<EventUser, Long> {

    EventUser findEventUserByEventIdAndUserId(Long idEvent,Long idUser);
}