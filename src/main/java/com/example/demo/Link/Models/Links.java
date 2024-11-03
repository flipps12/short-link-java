package com.example.demo.Link.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "links")
public class Links {
    @Id
    @GeneratedValue
    Long id;
    @Column(nullable = false)
    String link;
    String shortenedLink;
}
