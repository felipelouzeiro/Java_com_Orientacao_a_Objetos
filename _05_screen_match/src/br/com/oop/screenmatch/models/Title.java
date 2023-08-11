package br.com.oop.screenmatch.models;

public class Title {
    private String name;
    private int release_date;
    private boolean included_plan;
    private double rating;
    private int total_rating;
    private int durationMinutes;

    public Title(String name, int release_date, int durationMinutes) {
        this.name = name;
        this.release_date = release_date;
        this.durationMinutes = durationMinutes;
    }

    public Title() {
    }

    public void showSummary() {
        System.out.println("Nome: " + name);
        System.out.println("Ano: " + release_date);
        System.out.printf("Avaliação: %.1f%n", getAverageRatings());
        System.out.printf("Duração: %d%n", durationMinutes);
    }

    public void insertRatings(double note) {
        rating += note;
        total_rating++;
    }

    public double getAverageRatings() {
        return rating / total_rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public boolean isIncluded_plan() {
        return included_plan;
    }

    public void setIncluded_plan(boolean included_plan) {
        this.included_plan = included_plan;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }


}
