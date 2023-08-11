package models;

public class Favorites {

    public void include(Audio audio) {
        if (audio.getRating() == 5) {
            audio.setAbout("Fantástico, está entre os melhores!");
        } else if (audio.getRating() == 4) {
            audio.setAbout("Entre os populares do momento!");
        } else if (audio.getRating() == 3) {
            audio.setAbout("Muito comentado ultimamente!");
        } else if (audio.getRating() == 2) {
            audio.setAbout("Vale a pena conferir!");
        } else if (audio.getRating() == 1) {
            audio.setAbout("Salve para assistir mais tarde!");
        } else {
            audio.setAbout("...");
        }

        String resume = String.format("""
                ````````````````````````````````````
                Título:                    %s
                Curtidas:                  %d
                Reproduções:               %d
                Classificação:             %s
                Sobre:                     %s
                ````````````````````````````````````
                 """, audio.getTitle(), audio.getLikes(), audio.getReproductions(), audio.getRating(), audio.getAbout());

        System.out.println(resume);
    }
}
