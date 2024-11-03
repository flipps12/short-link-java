package com.example.demo.Link.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user_table")
public class Users {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String username;
    //String name;
    String password;
}
