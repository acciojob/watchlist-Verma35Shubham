package com.driver;

public class Movies {
    private String name;
    private double durationInMinute;
    private double imdbRating;

    public Movies() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDurationInMinute() {
        return durationInMinute;
    }

    public void setDurationInMinute(double durationInMinute) {
        this.durationInMinute = durationInMinute;
    }

    public double getImdbRating() {
        return imdbRating;
    }

    public void setImdbRating(double imdbRating) {
        this.imdbRating = imdbRating;
    }

    public Movies(String name, double durationInMinute, double imdbRating) {
        this.name = name;
        this.durationInMinute = durationInMinute;
        this.imdbRating = imdbRating;
    }
}
