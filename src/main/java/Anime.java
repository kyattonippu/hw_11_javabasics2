import java.util.LinkedList;
import java.util.List;

public class Anime {

    public List<String> anime = new LinkedList<>();

    public void addAnime(String title) {
        anime.add(title);
    }

    public void searchAnime(String title) {
        for (int i = 0; i < anime.size(); i++) {
            if (anime.contains(title)) {
                System.out.println("Аниме " + title + " доступно для просмотра");
                break;
            } else {
                System.out.println("Аниме не найдено");
            }
        }
    }

    public void removeAnime(String title) {
        for (int i = 0; i < anime.size(); i++) {
            if (anime.contains(title)) {
                anime.remove(title);
                break;
            } else {
                System.out.println("Аниме не найдено");
            }
        }
    }

    public void showAllAnime() {
        System.out.println("Список доступных для просмотра аниме: " + anime);
    }
}
