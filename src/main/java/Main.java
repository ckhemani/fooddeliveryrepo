import customer.Customer;
import deliveryapp.DeliveryApp;
import driver.Driver;
import restaurant.*;
import totalbill.TotalBill;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
//    private static final Path uberEatsFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\ubereats.txt");
//    private static final Path doorDashFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\doordash.txt");
//    private static final Path grubHubFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\grubhub.txt");
    private static final Path orderingAppFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\orderingapp.cvs");
    private static final Scanner input = new Scanner(System.in);
    private static final DeliveryApp deliveryAppName = new DeliveryApp();
    private static final Customer customer = new Customer();
    private static final Driver driver = new Driver();

    public static void main(String[] args) {
        //Greeting to EATING APP
        System.out.println(eatAppGreeting());

        // Select App for Delivery
        appDeliverySelect();

        // Adding driver in Deliver App.
        driverRegister();

        // Adding Customer in Deliver APP.
        customerRegister();

        // Adding Restaurant in App.
        addRestaurantsInApp();

        createAFile(orderingAppFilePath);

        //RW File Operation
        fileOperation();


//        // Restaurant Selection and Food Selection
//        while(true) {
//            switch (pickRestaurant()) {
//                case 1:
//                    System.out.println("You have picked Chinese Restaurant !");
//                    System.out.println(uberEats.getRestaurants().get(0).getItem());
//                    System.out.println("Total Bill to be paid " + TotalBillWithDeliveryApp() + " For Chinese Food");
//                    System.out.println();
//                    break;
//                case 2:
//                    System.out.println("You have picked up Fast Food Restaurant");
//                    System.out.println(uberEats.getRestaurants().get(1).getItem());
//                    System.out.println("Total Bill to be paid " + TotalBillWithDeliveryApp() + " For Fast Food");
//                    break;
//                case 3:
//                    System.out.println("You have picked up Indian Restaurant!");
//                    System.out.println(uberEats.getRestaurants().get(2).getItem());
//                    System.out.println("Total Bill to be paid " + TotalBillWithDeliveryApp() + " For Indian Food");
//                    break;
//                case 4:
//                    System.out.println("You have picked up Mexican Restaurant!");
//                    System.out.println(uberEats.getRestaurants().get(3).getItem());
//                    System.out.println("Total Bill to be paid " + TotalBillWithDeliveryApp() + " For Mexican Food");
//                    break;
//                case 5:
//                    System.out.println("Thank you " + uberEats.getOrderingAppCustomer().getFirstName() + " for visiting the DeliveryApp " + "UberEats");
//                    System.exit(0);
//                default:
//                    System.out.println("Please pick Restaurant 1-4 OR use 5 to exit");
//            }
//      }


    }

    public static String eatAppGreeting(){
        return "Welcome to App Ordering. Please keep eating and ordering online with palm of hands. In future we will have Health Professional visitation too for obesity";
    }

    public static void appDeliverySelect(){
        System.out.println("Select Delivery App");
        String appName = input.next();
        deliveryAppName.setDeliveryAppName(appName);
        System.out.println(deliveryAppName.getDeliveryAppName());
    }

    public static void driverRegister(){
        System.out.println("Please enter your  Name");
        driver.setName(input.next());
        System.out.println("Please enter your Car Details");
        driver.setCar(input.next());
        deliveryAppName.setDeliveryAppDriver(driver);
    }

    public static void customerRegister(){
        System.out.println("Please enter your first Name");
        customer.setFirstName(input.next());
        System.out.println("Please enter your Last Name");
        customer.setLastName(input.next());
        System.out.println("Please enter your Address");
        input.nextLine();
        customer.setAddress(input.nextLine());
        System.out.println("Please enter your Mobile Number");
        customer.setMobileNumber(input.nextLong());
        deliveryAppName.setOrderingAppCustomer(customer);
    }

    public static void addRestaurantsInApp(){
        ArrayList<Restaurant>  restaurants = new ArrayList<>();
        System.out.println("Please enter the Number of Restaurants to be added in App");
        int numberOfRestaurantToBeAdded = input.nextInt();

        for (int i = 0; i < numberOfRestaurantToBeAdded; i++){

            System.out.println("Please select cuisine type(Chinese/FastFood/Indian/Mexican) of restaurant to be added");
            String cuisineType = input.next();
            if(cuisineType.equals("Chinese")){
                ChineseRestaurant rest1 = new ChineseRestaurant();
                System.out.println("Please enter the name of Restaurant");
                rest1.setName(input.next());
                System.out.println("Please Enter Food Item to be ordered");
                rest1.setItem(input.next());
                System.out.println("Please enter the Spice Level");
                rest1.setSpiceLevel(input.next());
                System.out.println("Any Special notes");
                input.nextLine();
                rest1.setSpecialNotes(input.nextLine());
                System.out.println("Fortune cookies");
                rest1.setFortuneCookiepPackets(input.nextInt());
                System.out.println(rest1);
                restaurants.add(rest1);
                deliveryAppName.setRestaurants(restaurants);
            }
            else if(cuisineType.equals("FastFood")){
                FastFoodRestaurant rest1 = new FastFoodRestaurant();
                System.out.println("Please enter the name of Restaurant");
                rest1.setName(input.next());
                System.out.println("Please Enter Food Item to be ordered");
                rest1.setItem(input.next());
                System.out.println("Please enter the Spice Level");
                rest1.setSpiceLevel(input.next());
                System.out.println("Any Special notes");
                input.nextLine();
                rest1.setSpecialNotes(input.nextLine());
                System.out.println("Ketchup Packets");
                rest1.setKetchupPackets(input.nextInt());
                System.out.println(rest1);
                restaurants.add(rest1);
                deliveryAppName.setRestaurants(restaurants);
            }
            else if(cuisineType.equals("Indian")) {
                IndianRestaurant rest1 = new IndianRestaurant();
                System.out.println("Please enter the name of Restaurant");
                rest1.setName(input.next());
                System.out.println("Please Enter Food Item to be ordered");
                rest1.setItem(input.next());
                System.out.println("Please enter the Spice Level");
                rest1.setSpiceLevel(input.next());
                System.out.println("Any Special notes");
                input.nextLine();
                rest1.setSpecialNotes(input.nextLine());
                System.out.println("Chutney Packets");
                rest1.setChutneyPackets(input.nextInt());
                System.out.println(rest1);
                restaurants.add(rest1);
                deliveryAppName.setRestaurants(restaurants);
            }
            else if(cuisineType.equals("Mexican")) {
                MexicanRestaurant rest1 = new MexicanRestaurant();
                System.out.println("Please enter the name of Restaurant");
                rest1.setName(input.next());
                System.out.println("Please Enter Food Item to be ordered");
                rest1.setItem(input.next());
                System.out.println("Please enter the Spice Level");
                rest1.setSpiceLevel(input.next());
                System.out.println("Any Special notes");
                input.nextLine();
                rest1.setSpecialNotes(input.nextLine());
                System.out.println("Need Chip and Salsa(true/false)");
                rest1.isNeedChipAndSalsa(input.nextBoolean());
                System.out.println(rest1);
                restaurants.add(rest1);
                deliveryAppName.setRestaurants(restaurants);
            }
            else{
                i--;
            }
        }
        for (int i=0;i<deliveryAppName.getRestaurants().size();i++) {
            System.out.println(deliveryAppName.getRestaurants().get(i));
        }
    }

    public static void fileOperation() {
        System.out.println("Please enter you want to Read/Update File");
        String operation = input.next();
        String filePath = "";

        switch (operation) {
            case "Read":
                readAFile(orderingAppFilePath);
                break;
            case "Update":
                for(int i=0;i<deliveryAppName.getRestaurants().size();i++) {
                    writeAFile(orderingAppFilePath);
                }
                break;
            case "Delete":
                System.out.println("Deleting File. This facility is not available now");
                break;
            default:
                System.out.println("Please select Read/Update");
                break;
        }
    }
//    public static int pickRestaurant(){
//        System.out.println("""
//                Please enter your Restaurant Cuisine selection?
//                1. Chinese Restaurant
//                2. Fast Food Restaurant
//                3. Indian Restaurant
//                4  Mexican Restaurant
//                5. Exit
//                """);
//        return input.nextInt();
//    }

    public static float TotalBillWithDeliveryApp(){
        TotalBill total = new TotalBill();
        System.out.println("Please enter the Price of Item");
        total.setPriceOfItem(input.nextFloat());
        System.out.println("Please enter the Delivery Fee for Item");
        total.setDeliveryFee(input.nextFloat());
        System.out.println(total);
        float finalTotal = total.totalCost();
        System.out.println(finalTotal);
        return finalTotal;
    }

    //Create Files
    public static void createAFile(Path fileName){
        try{
            if(Files.notExists(fileName)) {
                Files.createFile(fileName);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void readAFile(Path fileName){
        String readFile = "";
        try {
            if (Files.exists(fileName)) {
                readFile = Files.readString(fileName);
                System.out.println(readFile);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void testreadAFile(Path fileName){
        String readFile = "";
        try {
            if (Files.exists(fileName)) {
                readFile = Files.readString(fileName);
                System.out.println(readFile);
                System.out.println(Files.readAllLines(fileName));

                String test = Files.readAllLines(fileName).get(Files.readAllLines(fileName).size()-1);
                System.out.println(test);
                String test1 = "";
                for (int j = 0;j < 8; j++){
                    test1+=test.charAt(j);
                }
                System.out.println(test1);
                int test2 = Integer.parseInt(test1);
                System.out.println(test2+=1);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    //Update
    public static void writeAFile(Path fileName){
        try{
            String readFile = "";
            if (Files.exists(fileName)) {
                readFile = Files.readString(fileName);
            }
            String test1 = deliveryAppName.toCvsFile();
            System.out.println(test1);
            String test2 = Files.readAllLines(fileName).get(Files.readAllLines(fileName).size()-1);
            String test3 = "";
            for (int j = 0;j < 8; j++){
                test3+=test2.charAt(j);
            }
            int test3Integer = Integer.parseInt(test3);
            test3Integer+=1;
            System.out.println(test3Integer);
            test3 = String.valueOf(test3Integer);
            ArrayList test4 = deliveryAppName.getRestaurants();
            Files.writeString(fileName,readFile);
            Files.writeString(fileName,"\n",StandardOpenOption.APPEND);
            Files.writeString(fileName,test3 + ",",StandardOpenOption.APPEND);
            Files.writeString(fileName,test1 + ",",StandardOpenOption.APPEND);

            for ( Object S : test4){
                Files.writeString(fileName,S + ",",StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
