package com.example.movies.controller;

import com.example.movies.model.Movie;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
@CrossOrigin
public class MovieController {

    @GetMapping
    public List<Movie> getMovies() {
        return List.of(
                new Movie(1L, "Inception"),
                new Movie(2L, "Interstellar"),
                new Movie(3L, "The Dark Knight")
        );
    }
}
