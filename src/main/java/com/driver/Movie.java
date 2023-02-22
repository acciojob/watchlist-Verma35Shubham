package com.driver;

public class Movie {
    private String name;
    private double durationInMinutes;
    private double imdbRating;

    public Movie() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationInMinutes() {
        return durationInMinutes;
    }

    public void setDurationInMinute(double durationInMinute) {
        this.durationInMinutes = durationInMinute;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Movie(String name, double durationInMinute, double imdbRating) {
        this.name = name;
        this.durationInMinutes = durationInMinute;
        this.imdbRating = imdbRating;
    }
}
