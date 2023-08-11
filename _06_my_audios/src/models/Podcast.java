package models;

public class Podcast extends Audio {
    private String host;
    private String description;

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public int getRating() {
        if (this.getLikes() > 300000) {
            return 5;
        } else if (this.getLikes() > 250000) {
            return 4;
        } else if (this.getLikes() > 150000) {
            return 3;
        } else if (this.getLikes() > 100000) {
            return 2;
        } else return 1;
    }
}
