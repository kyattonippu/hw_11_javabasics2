import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Movies {

    private Set<String> storedMovies = new HashSet<>();

    public void addMovie(String title) {
        storedMovies.add(title);
    }

    public void removeMovie(String title) {
        if (storedMovies.contains(title)) {
            storedMovies.remove(title);
        }
    }

    public void printAllMovies() {
        Iterator<String> itFilm = storedMovies.iterator();
        while (itFilm.hasNext()) {
            System.out.println(itFilm.next());
        }
    }

    public void searchMovie(String title) {
        for (String storedMovies : storedMovies) {
            if (storedMovies.contains(title)) {
                System.out.println("Фильм доступен для просмотра");
            } else System.out.println("Фильм не найден");
        }
    }
}
