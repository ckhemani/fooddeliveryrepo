import customer.Customer;
import deliveryapp.DeliveryApp;
import driver.Driver;
import enums.EStates;
import restaurant.*;
import totalbill.TotalBill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main {
//    private static final Path uberEatsFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\ubereats.txt");
//    private static final Path doorDashFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\doordash.txt");
//    private static final Path grubHubFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\grubhub.txt");
    private static final Path orderingAppFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\orderingapp.cvs");
    private static final  Scanner input = new Scanner(System.in);
    private static final DeliveryApp deliveryAppName = new DeliveryApp();
    private static final Customer customer = new Customer();
    private static final Driver driver = new Driver();

    public static void main(String[] args) {
        //Greeting to EATING APP
        System.out.println(eatAppGreeting());

        while (true) {
            System.out.println("""
                    1 to place new Order.
                    2 to view all Orders.
                    3 to view particular order.
                    10 to exit of Switch loop
                    """);
            String choice = input.next();
            switch (choice) {
                case "1":
                    // Select App for Delivery
                    selectAppDeliverySelect();
                    // Adding driver in Deliver App.
                    driverRegister();
                    // Adding Customer in Deliver APP.
                    customerRegister();
                    // Adding Restaurant in App.
                    selectRestaurantsInApp();
                    // Update the order details
                    writeAFile(orderingAppFilePath);
                    break;
                case "2":
                    // Read the Complete File
                    readAFile(orderingAppFilePath);
                    break;
                case "3":
                    // View particular order with order Number
                    System.out.println("Do you have oder Number to be pulled? \"Yes OR No\"");
                    String yesOrNo = input.next();
                    if (yesOrNo.equals("Yes")) {
                        System.out.println("Enter the Order Number to be retrieved");
                        String orderNumber = input.next();
                        getDetailswithOrderNumber(orderingAppFilePath, orderNumber);
                    } else if(yesOrNo.equals("No")) {
                        System.out.println("Function coming soon");
                    }
                    break;
                    case "10":
                        System.out.println("Exiting. Thanks for visiting the FoodOrderingApp");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Please select the choices");
                }
            }
        }
    public static String eatAppGreeting(){
        return "Welcome to App Ordering. " +
                "Please keep eating and ordering online with palm of hands. "+
                "In future we will have Health Professional visitation too for obesity.";
    }

    public static void selectAppDeliverySelect(){
        System.out.println("Select Delivery App? \"UberEats/DoorDash/Grubhub\"");
        String appName = input.next();
        deliveryAppName.setDeliveryAppName(appName);
    }

    public static void driverRegister(){
        System.out.println("Please enter Driver Name");
        driver.setName(input.next());
        System.out.println("Please enter Driver Car Details");
        driver.setCar(input.next());
        deliveryAppName.setDeliveryAppDriver(driver);
    }

    public static void customerRegister(){
        System.out.println("Please enter Customer first Name");
        customer.setFirstName(input.next());
        System.out.println("Please enter Customer Last Name");
        customer.setLastName(input.next());
        System.out.println("Please enter Customer Address");
        input.nextLine();
        customer.setAddress(input.nextLine());
        System.out.println("Please enter Customer Mobile Number");
        customer.setMobileNumber(input.nextLong());
        deliveryAppName.setOrderingAppCustomer(customer);
    }

    public static void selectRestaurantsInApp(){
        ArrayList<Restaurant>  restaurants = new ArrayList<>();
        System.out.println("Please select cuisine type(Chinese/FastFood/Indian/Mexican) of restaurant to be added");
        String cuisineType = input.next();
        if(cuisineType.equals("Chinese")){
                ChineseRestaurant rest1 = new ChineseRestaurant();
                System.out.println("Please enter the name of Chinese Restaurant");
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
                System.out.println("Please enter the name of FastFood Restaurant");
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
                System.out.println("Please enter the name of Indian Restaurant");
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
                System.out.println("Please enter the name of Mexican Restaurant");
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
    }

    public static void fileOperation() {
        System.out.println("Please enter you want to Read/Update File OR get order details");
        String operation = input.next();
        String filePath = "";

        switch (operation) {
            case "Read":
                readAFile(orderingAppFilePath);
                break;
            case "Update":
                writeAFile(orderingAppFilePath);
                break;
            case "Delete":
                System.out.println("Deleting File. This facility is not available now");
                break;
            case "orderdetails":
                System.out.println("Enter the Order Number to be retrieved");
                String orderNumber = input.next();
                getDetailswithOrderNumber(orderingAppFilePath,orderNumber);
                break;
            default:
                System.out.println("Please select Read/Update");
                break;
        }
    }

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


    //Update
    public static void writeAFile(Path fileName){
        try{
            String readFile = "";
            if (Files.exists(fileName)) {
                readFile = Files.readString(fileName);
            }
            String deliveryApptoCVS = deliveryAppName.toCvsFile();
            String lastLineOfFile = Files.readAllLines(fileName).get(Files.readAllLines(fileName).size()-1);
            String[] temp1 = lastLineOfFile.split(",");
            String temp2 = "";
            String orderNumber = temp1[0];
            for (int x=1;x<temp1.length;x++){
                temp2 += temp1[x] + ",";
            }

            int orderNumberToInteger = Integer.parseInt(orderNumber);
            orderNumberToInteger+=1;
            orderNumber = String.valueOf(orderNumberToInteger);

            ArrayList test4 = deliveryAppName.getRestaurants();
            Files.writeString(fileName,readFile);
            Files.writeString(fileName,"\n" + orderNumber + "," + deliveryApptoCVS + ',',StandardOpenOption.APPEND);
            for ( Object S : test4){
                    Files.writeString(fileName,S + ",",StandardOpenOption.APPEND);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getDetailswithOrderNumber(Path fileName,String orderNumber) {
        try {
            Map<String, String> orderDetails = new HashMap<>();
            String readFile = "";
            String eachLine = "";
            String lastLineOfFile = Files.readAllLines(fileName).get(Files.readAllLines(fileName).size() - 1);
            String[] temp1 = lastLineOfFile.split(",");

            for(int x =0;x<Files.readAllLines(fileName).size();x++){
                eachLine = Files.readAllLines(fileName).get(x);
                String temp5 = "";
                String [] arrayEachLine = eachLine.split(",");
                String temp6 = arrayEachLine[0];
                for(int y=1;y<arrayEachLine.length;y++){
                    temp5+=arrayEachLine[y]+",";
                }
                orderDetails.put(temp6,temp5);
            }
            System.out.println(orderDetails.get(orderNumber));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
