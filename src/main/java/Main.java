import deliveryapp.DeliveryApp;
import restaurant.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Scanner input = new Scanner(System.in);
    private static final DeliveryApp uberEats = new DeliveryApp("UberEats");
    private static final ChineseRestaurant chinaKing = new ChineseRestaurant("Fried Rice","Rice with Vegetables","medium","Hot Sauce on Side",1,4);
    private static final FastFoodRestaurant chickAFila = new FastFoodRestaurant("Fried Chicken","Chicken Fried","medium","Buffalo Sauce on side",2);
    private static final IndianRestaurant rasoi = new IndianRestaurant("Tandoor Chicken","Chicked merinated and Grilled","medium","Onions on Side",1);
    private static final MexicanRestaurant chipotle = new MexicanRestaurant("Chicken Bowl","Chicken with no Glau","medium","put hot sauce on side",false);

    public static void main(String[] args) {
        System.out.println(eatAppGreeting());

        addRestaurantInApp();

    }

    public static String eatAppGreeting(){
        return "Welcome to App Ordering";
    }

    public static void addRestaurantInApp(){
        ArrayList<Restaurant>  restaurants = new ArrayList<>();
        restaurants.add(chinaKing);
        restaurants.add(chickAFila);
        restaurants.add(rasoi);
        restaurants.add(chipotle);

        uberEats.setRestaurants(restaurants);
    }
}
