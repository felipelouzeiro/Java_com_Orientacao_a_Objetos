package models;

public class Audio {
    private String title;
    private int reproductions;
    private int likes;
    private int rating;
    private String about;

    public void like() {
        this.likes++;
    }

    public void play() {
        this.reproductions++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReproductions() {
        return reproductions;
    }

    public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
}
