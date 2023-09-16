package com.example.eventbooking.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
//import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "users")
public class User {
    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id", nullable = false)
    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    private String email;
//    @Lob
    private String photo;


//    @ManyToMany(mappedBy = "users")
//    List<Event>events;

//    @OneToMany(mappedBy = "user",fetch=FetchType.LAZY,cascade = CascadeType.ALL)
//    private List<EventUser> eventUsers;


}