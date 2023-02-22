package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

@Repository
public class MovieRepositry
{
    private HashMap<String, Movies> moviesMap;
    private HashMap<String, Director> directorMap;
    private HashMap<String, List<String>> directorMovieMap;

    public MovieRepositry(HashMap<String, Movies> moviesMap, HashMap<String, Director> directorMap, HashMap<String, List<String>> directorMovieMap) {
        this.moviesMap = moviesMap;
        this.directorMap = directorMap;
        this.directorMovieMap = directorMovieMap;
    }

    public void saveMovie(Movies movie){
        moviesMap.put(movie.getName(), movie);
    }
    public void saveDirector(Director director){
        directorMap.put(director.getName(), director);
    }

    public void saveMovieDirectorPair(String movie, String director){
        if(moviesMap.containsKey(movie) && directorMap.containsKey(director)){
            moviesMap.put(movie, moviesMap.get(movie));
            List<String> currentMovies = new ArrayList<>();
            if(directorMovieMap.containsKey(director))
                currentMovies = directorMovieMap.get(director);
            currentMovies.add(movie);
            directorMovieMap.put(director, currentMovies);
        }
    }

    public Movies findMovie(String movie){
        return moviesMap.get(movie);
    }

    public Director findDirector(String director){
        return directorMap.get(director);
    }

    public List<String> findMoviefromDirector(String director){
        List<String> movieList = new ArrayList<>();
        if(directorMovieMap.containsKey(director))
            movieList = directorMovieMap.get(director);
        return movieList;
    }

    public List<String> findAllMovies(){
        return new ArrayList<>(moviesMap.keySet());
    }

    public void deleteDirector(String director){
        List<String> movies = new ArrayList<>();
        if(directorMovieMap.containsKey(director)){
            movies = directorMovieMap.get(director);
            for (String movie : movies){
                if(moviesMap.containsKey(movie)){
                    moviesMap.remove(movie);
                }
            }

            directorMovieMap.remove(director);
        }
        if(directorMap.containsKey(director)){
            directorMap.remove(director);
        }
    }

    public void deleteAllDirector(){
        HashSet<String> movieSet = new HashSet<>();

        for(String director : directorMovieMap.keySet()){
            for(String movie : directorMovieMap.get(director)){
                movieSet.add(movie);
            }
        }

        for (String movie : movieSet){
            if (moviesMap.containsKey(movie)){
                moviesMap.remove(movie);
            }
        }
    }
}
