import java.util.ArrayList;
import java.util.List;

public class TvSeries {

    List<String> storedTvSeries = new ArrayList<>();

    public void addTvSeries(String title) {
        storedTvSeries.add(title);
    }

    public void removeTvSeries(String title) {
        storedTvSeries.remove(title);
    }

    public void searchTvSeries(String title) {
        for (String storedTvSeries : storedTvSeries) {
            if (storedTvSeries.contains(title)) {
                System.out.println("Сериал доступен для просмотра");
            } else System.out.println("Сериал не найден");
        }
    }
}
