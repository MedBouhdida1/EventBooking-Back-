package com.example.eventbooking.Models;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@NoArgsConstructor
@AllArgsConstructor

@Document(collection = "eventUsers")
public class EventUser {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @ManyToOne
//    @JoinColumn(name = "event_id")
//    @JsonIgnoreProperties("eventUsers")
//    private Event event;

//    @ManyToOne
//    @JoinColumn(name = "user_id")
//    @JsonIgnoreProperties("eventUsers")
//    private User user;

    private String date;
}
