package calculations;

import br.com.oop.screenmatch.models.Title;

public class CalculateTime {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void include(Title title) {
        this.totalTime += title.getDurationMinutes();
    }
}
