package Level2;

import java.util.Comparator;
import java.util.Objects;

public class RestaurantComparator implements Comparator<Restaurant> {
    @Override
    public int compare(Restaurant res1, Restaurant res2) {
        if (Objects.equals(res1.getName(), res2.getName())) {
            return Integer.compare(res2.getRating(),res1.getRating());
        }
        return res1.getName().compareTo(res2.getName());
    }
}
