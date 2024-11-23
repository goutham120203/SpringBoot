package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Movies;
import com.example.demo.service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    MovieService service;

    @GetMapping("/getmovies")
    public List<Movies> getMovies() {
        return service.getMovies(); 
    }

    @PostMapping("/movies")
    public void addMovie(@RequestBody Movies movie){
    service.addMovie(movie);
    }

    @GetMapping("/movies/{MovieId}")
    public Movies getMovieById(@PathVariable int MovieId){
        return service.getMovieById(MovieId);
    }

    @PutMapping("/updatemovie")
    public void updateMovie(@RequestBody Movies movie){
        service.updateMovie(movie);
    }

    @DeleteMapping("/movies/{MovieId}")
    public void deleteMovie(@PathVariable int MovieId){
        service.deleteMovie(MovieId);
    }
}
