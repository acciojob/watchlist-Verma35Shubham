package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MovieController {
    @Autowired
    MovieService movieServices;

    @PostMapping("/add_movie")
    public ResponseEntity<String> addMovie(@RequestBody() Movies movie){
        movieServices.addMovie(movie);
        return new ResponseEntity<>("new movie added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add_director")
    public ResponseEntity<String> addDirector(@RequestBody() Director director){
        movieServices.addDirector(director);
        return new ResponseEntity<>("new director added successfully", HttpStatus.CREATED);
    }

    @PostMapping("/add_movie_director_pair")
    public ResponseEntity<String> addMovieDirectorPair(@RequestParam("movie") String movie, @RequestParam("director") String director){
        movieServices.createMovieDirectorPair(movie, director);
        return new ResponseEntity<>("new movie-director pair added successfully", HttpStatus.CREATED);
    }

    @GetMapping("/get_movie_by_name/{name}")
    public ResponseEntity<Movies> getMovieByName(@PathVariable String name){
        Movies movie = movieServices.findMovie(name);
        return new ResponseEntity<>(movie, HttpStatus.CREATED);
    }

    @GetMapping("/get_director_by_name/{name}")
    public ResponseEntity<Director> getDirectorByName(@PathVariable String name){
        Director director = movieServices.findDirector(name);
        return new ResponseEntity<>(director, HttpStatus.CREATED);
    }

    @GetMapping("/get_movies_by_director_name/{director}")
    public ResponseEntity<List<String>> getMovieByDirectorName(@PathVariable String director){
        List<String> movies = movieServices.findMoviefromDirector(director);
        return new ResponseEntity<>(movies, HttpStatus.CREATED);
    }

    @GetMapping("/get_All_movies")
    public ResponseEntity<List<String>> findAllMovies(){
        List<String> movies = movieServices.findAllMovie();
        return new ResponseEntity<>(movies, HttpStatus.CREATED);
    }

    @GetMapping("/delet_director_by_name")
    public ResponseEntity<String> deleteDirectorByName(@RequestParam String director){
        movieServices.deleteDirector(director);
        return new ResponseEntity<>(director + " removed successfully", HttpStatus.CREATED);
    }

    public ResponseEntity<String> deleteAllDirectors(){
        movieServices.deleteAllDirector();
        return new ResponseEntity<>("All directors deleted successfully", HttpStatus.CREATED);
    }
}
