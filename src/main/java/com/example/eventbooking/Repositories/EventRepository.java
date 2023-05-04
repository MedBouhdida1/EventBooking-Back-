package com.example.eventbooking.Repositories;

import com.example.eventbooking.Models.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event, Long> {
}