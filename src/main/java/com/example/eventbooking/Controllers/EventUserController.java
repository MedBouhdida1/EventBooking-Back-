package com.example.eventbooking.Controllers;


import com.example.eventbooking.Models.EventUser;
import com.example.eventbooking.Models.Venue;
import com.example.eventbooking.Repositories.EventUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/eventuser")
public class EventUserController {

    @Autowired
    private EventUserRepository eventUserRepository;



    @PostMapping
    private EventUser addEventUser(@RequestBody EventUser eventUser){
        eventUserRepository.save(eventUser);
        return eventUser;
    }

    @GetMapping
    private List<EventUser> listEventUser(){
        return eventUserRepository.findAll();
    }

}
