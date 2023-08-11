import br.com.oop.screenmatch.models.Film;
import br.com.oop.screenmatch.models.Sitcom;
import calculations.CalculateTime;
import calculations.RecommendationFilter;

public class Main {
    public static void main(String[] args) {
        Film filmA = new Film();
        Sitcom sitcomB = new Sitcom();

        filmA.setName("Filme Tal");
        filmA.setDirector("Fulano de Tal");
        filmA.setRelease_date(2021);
        filmA.insertRatings(9.7);
        filmA.setDurationMinutes(160);

        filmA.showSummary();

        System.out.println();

        sitcomB.setName("Seriado Tal");
        sitcomB.setRelease_date(2023);
        sitcomB.insertRatings(9.6);
        sitcomB.setEpisodesPerSeason(8);
        sitcomB.setMinutesPerEpisode(48);
        sitcomB.setSeasons(4);

        sitcomB.showSummary();

        CalculateTime calculateTime = new CalculateTime();
        calculateTime.include(filmA);
        calculateTime.include(sitcomB);
        System.out.println(calculateTime.getTotalTime());

        RecommendationFilter filter = new RecommendationFilter();
        filter.toRank(filmA);
    }
}