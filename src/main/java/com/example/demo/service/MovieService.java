package com.example.demo.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Movies;
import com.example.demo.repo.MovieRepo;

@Service
public class MovieService {

    @Autowired
    MovieRepo repo;
    
    public List<Movies> getMovies(){
        return repo.findAll();
    }

    public void addMovie(Movies movie) {
    repo.save(movie);
    }

    public Movies getMovieById(int MovieId) {
            return repo.findById(MovieId).orElse(new Movies());
        
    }

    public void updateMovie(Movies movie){
        repo.save(movie);
    }

    public void deleteMovie(int MovieId){
        repo.deleteById(MovieId);
    }



}
