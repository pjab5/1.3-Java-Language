package Level2;

import java.util.HashSet;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        HashSet<Restaurant> restaurants = new HashSet<>();
        restaurants.add(new Restaurant("Les Moles",3));
        restaurants.add(new Restaurant("Can Pepet",1));
        restaurants.add(new Restaurant("El celler de Can Roca",5));
        restaurants.add(new Restaurant("Bulli",5));
        restaurants.add(new Restaurant("El celler de Can Roca",2));
        restaurants.add(new Restaurant("El celler de Can Roca",3));
        restaurants.add(new Restaurant("El celler de Can Rocb",2));
        restaurants.add(new Restaurant("Bar Manolo",2));
        restaurants.add(new Restaurant("Bar Manolo",5));

        NavigableSet< Restaurant > restaurantsorder = new TreeSet<>( new RestaurantComparator() );
        restaurantsorder.addAll(restaurants);
        System.out.println("\nRestaurants ordered by name and rating:");
        for (Restaurant restaurant: restaurantsorder){
            System.out.println("name: " + restaurant.getName() + ", rating: " + restaurant.getRating());

        }
    }
}


