package com.example.demo.Repositories;

import com.example.demo.Link.Models.Links;
import com.example.demo.Link.Models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LinkRepository extends JpaRepository<Links, Long> {
    Optional<Links> findByShortenedLink(String shortenedLink);
}
