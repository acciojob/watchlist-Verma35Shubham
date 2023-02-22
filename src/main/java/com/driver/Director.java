package com.driver;

public class Director {
    private String name;
    private int numberOfmovies;
    private double imdbRating;

    public Director() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfmovies() {
        return numberOfmovies;
    }

    public void setNumberOfmovies(int numberOfmovies) {
        this.numberOfmovies = numberOfmovies;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Director(String name, int numberOfmovies, double imdbRating) {
        this.name = name;
        this.numberOfmovies = numberOfmovies;
        this.imdbRating = imdbRating;
    }
}
