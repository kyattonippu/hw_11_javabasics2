import java.util.HashMap;
import java.util.Map;

public class Cartoons {

    Map<Integer, String> storedCartoons = new HashMap<>();

    public void addCartoon(int year, String title) {
        storedCartoons.put(year, title);
    }

    public void removeCartoon(String title) {
        storedCartoons.remove(title);
    }

    public void printAllCartoons() {
        for (Map.Entry<Integer, String> entry : storedCartoons.entrySet()) {
            System.out.println(entry.getKey() + "  " + entry.getValue());
        }
    }
}
