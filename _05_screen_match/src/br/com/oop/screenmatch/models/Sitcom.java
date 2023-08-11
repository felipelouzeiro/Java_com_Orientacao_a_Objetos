package br.com.oop.screenmatch.models;

import calculations.Sortable;

public class Sitcom extends Title {
    private int seasons;
    private boolean active;
    private int episodesPerSeason;
    private  int minutesPerEpisode;

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public int getDurationMinutes() {
        return seasons * episodesPerSeason * minutesPerEpisode;
    }

    @Override
    public void showSummary() {
            System.out.println("Nome: " + getName());
            System.out.println("Ano: " + getRelease_date());
            System.out.printf("Avaliação: %.1f%n", getAverageRatings());
            System.out.printf("Duração: %d%n", getDurationMinutes());
    }

}
