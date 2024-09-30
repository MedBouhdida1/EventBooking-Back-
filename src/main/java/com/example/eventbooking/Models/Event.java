package com.example.eventbooking.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.*;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity


public class Event {

    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String category;

    private String date;

    private String time;

    private String duration;

    private String description;

//    @Lob
    private String banner;

    private int price;


    @ManyToOne
    @JoinColumn(name = "organizer_id")
    @JsonIgnoreProperties("events")
    private Organizer organizer;


    @OneToOne(mappedBy = "event",cascade = CascadeType.ALL)
    @JsonIgnoreProperties("event")
    private Venue venue;


    @ManyToMany
    @JoinTable(name = "Event_users",
            joinColumns = @JoinColumn(name = "event_id", referencedColumnName = "id"))
    @JsonIgnoreProperties("events")
    private List<User> users ;

    @OneToMany(mappedBy = "event",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
    private List<EventUser> eventUsers;



}
