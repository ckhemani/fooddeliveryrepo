import customer.Customer;
import deliveryapp.DeliveryApp;
import driver.Driver;
import restaurant.*;
import totalbill.TotalBill;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final Path uberEatsFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\ubereats.txt");
    private static final Scanner input = new Scanner(System.in);
    private static final DeliveryApp uberEats = new DeliveryApp("UberEats");
    private static final ChineseRestaurant chinaKing = new ChineseRestaurant("Fried Rice","Rice with Vegetables","medium","Hot Sauce on Side",1,4);
    private static final FastFoodRestaurant chickAFila = new FastFoodRestaurant("Fried Chicken","Chicken Fried","medium","Buffalo Sauce on side",2);
    private static final IndianRestaurant rasoi = new IndianRestaurant("Tandoor Chicken","Chicked merinated and Grilled","medium","Onions on Side",1);
    private static final MexicanRestaurant chipotle = new MexicanRestaurant("Chicken Bowl","Chicken with no Glau","medium","put hot sauce on side",false);

    public static void main(String[] args) {
        //Greeting to EATING APP
        System.out.println(eatAppGreeting());

        // Adding Customer and Driver in APP.
        customerRegister();
        driverRegister();

        // Adding Restaurant in App.
        addRestaurantsInApp();

        //Testing the File operation
        createAUberEatsFile();
        writeAUberEatAFile();
        readAUberEatAFile();

        // Restaurant Selection and Food Selection
        while(true) {
            switch (pickRestaurant()) {
                case 1:
                    System.out.println("You have picked Chinese Restaurant !");
                    System.out.println(uberEats.getRestaurants().get(0));
                    System.out.println(TotalBillWithDeliveryApp());
                    System.out.println();
                    break;
                case 2:
                    System.out.println("You have picked up Fast Food Restaurant");
                    System.out.println(uberEats.getRestaurants().get(1));
                    System.out.println(TotalBillWithDeliveryApp());
                    break;
                case 3:
                    System.out.println("You have picked up Indian Restaurant!");
                    System.out.println(uberEats.getRestaurants().get(2));
                    System.out.println(TotalBillWithDeliveryApp());
                    break;
                case 4:
                    System.out.println("You have picked up Mexican Restaurant!");
                    System.out.println(uberEats.getRestaurants().get(3));
                    System.out.println(TotalBillWithDeliveryApp());
                    break;
                case 5:
                    System.out.println("Thank you " + uberEats.getOrderingAppCustomer().getFirstName() + " for visiting the DeliveryApp " + "UberEats");
                    System.exit(0);
                default:
                    System.out.println("Please pick Restaurant 1-4 OR use 5 to exit");
            }
        }


    }

    public static String eatAppGreeting(){
        return "Welcome to App Ordering";
    }

    public static void addRestaurantsInApp(){
        ArrayList<Restaurant>  restaurants = new ArrayList<>();
        restaurants.add(chinaKing);
        restaurants.add(chickAFila);
        restaurants.add(rasoi);
        restaurants.add(chipotle);

        uberEats.setRestaurants(restaurants);

    }

    public static void customerRegister(){
        System.out.println("Please enter your first Name");
        String firstName = input.next();
        System.out.println("Please enter your Last Name");
        String lastName = input.next();
        System.out.println("Please enter your Address");
        String address = input.next();
        System.out.println("Please enter your Mobile Number");
        long mobileNumber = input.nextLong();

        uberEats.setOrderingAppCustomer(new Customer(firstName,lastName,address,mobileNumber));
    }

    public static void driverRegister(){
        System.out.println("Please enter your  Name");
        String driverName = input.next();
        System.out.println("Please enter your Car Details");
        String driverCar = input.next();

        uberEats.setDeliveryAppDriverName(new Driver(driverName,driverCar));
        System.out.println(uberEats.getDeliveryAppDriverName());
    }

    public static int pickRestaurant(){
        System.out.println("""
                sout("Please enter your Restaurant Cuisine selection?"
                1. Chinese Restaurant
                2. Fast Food Restaurant
                3. Indian Restaurant
                4  Mexican Restaurant
                5. Exit
                """);
        return input.nextInt();
    }

    public static float TotalBillWithDeliveryApp(){
        System.out.println("Please enter the Price of Item");
        float priceOfItem = input.nextFloat();
        System.out.println("Please enter the Delivery Fee for Item");
        float deliveryFee = input.nextFloat();


//        TotalBill temp123 = new TotalBill(10,4);
        TotalBill total = new TotalBill();
        total.setPriceOfItem(priceOfItem);
        total.setDeliveryFee(deliveryFee);
        System.out.println(total);
        float finalTotal = total.totalCost();
        System.out.println(finalTotal);
        return finalTotal;
    }
    //Create
    public static void createAUberEatsFile(){
        try{
            Files.createFile(uberEatsFilePath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //Update
    public static void writeAUberEatAFile(){
        try{
            Files.writeString(uberEatsFilePath,"This is UberEats App Data File.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Read
    public static void readAUberEatAFile(){
        String temp;
        try{
            temp = Files.readString(uberEatsFilePath);
            System.out.println(temp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
