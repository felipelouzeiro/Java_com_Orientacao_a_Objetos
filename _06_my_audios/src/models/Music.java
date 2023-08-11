package models;

public class Music extends Audio {
    private String album;
    private String artist;
    private String genre;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public int getRating() {
        if (this.getReproductions() > 300000) {
            return 5;
        } else if (this.getReproductions() > 250000) {
            return 4;
        } else if (this.getReproductions() > 150000) {
            return 3;
        } else if (this.getReproductions() > 100000) {
            return 2;
        } else {
            return 1;
        }
    }
}
