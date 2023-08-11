package br.com.oop.screenmatch.models;

import calculations.Sortable;

public class Episode implements Sortable {
    private int number;
    private String name;
    private Sitcom sitcom;
    private int views;

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Sitcom getSitcom() {
        return sitcom;
    }

    public void setSitcom(Sitcom sitcom) {
        this.sitcom = sitcom;
    }

    @Override
    public int getRating() {
        if (views > 1000){
            return 5;
        } else if (views > 750) {
            return 4;
        } else if (views > 500) {
            return 3;
        } else if (views > 250) {
            return 2;
        } else return 1;
    }
}
