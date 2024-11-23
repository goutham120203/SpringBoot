package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Movies;

@Repository
public interface MovieRepo extends JpaRepository<Movies, Integer> {

}
