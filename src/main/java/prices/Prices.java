package prices;

import enums.RestaurantType;
import restaurant.ChineseRestaurant;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Prices {
    RestaurantType cuisine;
    private static final Scanner scan = new Scanner(System.in);

    public Prices() {
    }

    public Prices(RestaurantType cuisine) {
        this.cuisine = cuisine;
    }



    public void getRestaurantMenu(RestaurantType foodType) {
        switch (foodType) {
            case INDIAN -> {
                System.out.println("You have selected Indian Restaurant");
                System.out.println("Please select the Restaurant Name");
                String name = scan.next();
                selectRestaurantName(name);
                break;
            }
            case CHINESE -> {
                System.out.println("You have selected Chinese Restaurant");
                System.out.println("Please select the Restaurant Name");
                String name = scan.next();
                selectRestaurantName(name);
                break;
            }
            case FASTFOOD -> {
                System.out.println("You have Selected FastFood Restaurant");
                System.out.println("Please select the Restaurant Name");
                String name = scan.next();
                selectRestaurantName(name);
                break;
            }
            case MEXICAN -> {
                System.out.println("You have selected Mexican Restaurant");
                System.out.println("Please select the Restaurant Name");
                String name = scan.next();
                selectRestaurantName(name);
                break;
            }
            default -> {
                System.out.println("You didn't selected proper choice");
            }
        }
    }

    public void selectRestaurantName(String name){

    }

}

