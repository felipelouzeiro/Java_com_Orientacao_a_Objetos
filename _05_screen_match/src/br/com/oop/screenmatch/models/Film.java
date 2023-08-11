package br.com.oop.screenmatch.models;

import calculations.Sortable;

public class Film extends Title implements Sortable {
    private String director;

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRating() {
        return (int) (getAverageRatings() /2);
    }
}
