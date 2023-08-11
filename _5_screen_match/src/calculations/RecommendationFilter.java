package calculations;

import br.com.oop.screenmatch.models.Title;

public class RecommendationFilter {
    public void toRank(Sortable sortable){
        if (sortable.getRating() == 5){
            System.out.println("Está entre os preferidos do momento!");
        } else if (sortable.getRating() >= 3) {
            System.out.println("Muito bem avaliado!");
        }else System.out.println("Adicione a sua lista!");
    }
}
