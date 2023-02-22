package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    @Autowired
    MovieRepositry movieRepositry;

    public void addMovie(Movie movies){
        movieRepositry.saveMovie(movies);
    }
    public void addDirector(Director director){
        movieRepositry.saveDirector(director);
    }
    public void createMovieDirectorPair(String movie, String director){
        movieRepositry.saveMovieDirectorPair(movie, director);
    }

    public Movie findMovie(String movieName){
        return movieRepositry.findMovie(movieName);
    }
    public Director findDirector(String directorName){
        return movieRepositry.findDirector(directorName);
    }
    public List<String> findMoviefromDirector(String director){
        return movieRepositry.findMoviefromDirector(director);
    }
    public List<String> findAllMovie(){
        return movieRepositry.findAllMovies();
    }
    public void deleteDirector(String director){
        movieRepositry.deleteDirector(director);
    }
    public void deleteAllDirector(){
        movieRepositry.deleteAllDirector();
    }
}
