import models.Favorites;
import models.Music;
import models.Podcast;

public class Main {
    public static void main(String[] args) {
        Music musicA = new Music();
        musicA.setTitle("Say yes");
        musicA.setGenre("Rock Indie");
        for (int i = 0; i < 834251; i++) {
            musicA.play();
            if (i % 2 == 0) {
                musicA.like();
            }
        }

        Podcast podcastB = new Podcast();
        podcastB.setTitle("Podepah Podpah");
        podcastB.setHost("Igão e Mítico");
        for (int i = 0; i < 487587; i++) {
            podcastB.play();
            if (i % 2 == 1) {
                podcastB.like();
            }
        }

        Favorites favorites = new Favorites();

        favorites.include(musicA);
        favorites.include(podcastB);
    }
}