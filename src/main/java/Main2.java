import customer.Customer;
import deliveryapp.DeliveryApp;
import deliveryapp.DeliveryApp2;
import driver.Driver;
import restaurant.*;
import totalbill.TotalBill;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;

public class Main2 {
    private static final Path orderingAppFilePath = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\orderingapp2.cvs");
    private static final Path indianMenu = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\Indianmenu.txt");
    private static final Path chineseMenu = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\Chinesemenu.txt");
    private static final Path fastFastMenu = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\FastFoodmenu.txt");
    private static final Path mexicanMenu = Paths.get(System.getProperty("user.dir") + "\\orderingdata\\Mexicanmenu.txt");
    private static final Scanner input = new Scanner(System.in);
    private static final DeliveryApp2 deliveryAppName = new DeliveryApp2();
    private static final Customer customer = new Customer();
    private static final Driver driver = new Driver();
    private static final TotalBill totalbill = new TotalBill();
    public static void main(String[] args) throws IOException {
        createAFile(orderingAppFilePath);
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
                    // Total Bill to be paid
                    // totalbill.totalCost();
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
                        getDetailsWithOrderNumber(orderingAppFilePath, orderNumber);
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

    public static void selectRestaurantsInApp() throws IOException {
        ArrayList<Restaurant2> restaurants = new ArrayList<>();
        System.out.println("Please select cuisine type(Chinese/FastFood/Indian/Mexican) of restaurant to be added");
        String cuisineType = input.next();
        HashSet<String> itemList = new HashSet<>();
        String foodItems = "";
        float priceOfOrderedItems = 0;
//        if(cuisineType.equals("Chinese")){
//            ChineseRestaurant2 rest1 = new ChineseRestaurant2();
//            System.out.println("Please enter the name of Chinese Restaurant");
//            rest1.setName(input.next());
//            System.out.println("Please Number of Food Items to be ordered");
//            int foodItemsNum = input.nextInt();
//            for(int i=0;i<foodItemsNum;i++) {
//                System.out.println("Please Enter Food Items to be ordered");
//                foodItems = input.next();
//                itemList.add(foodItems);
//            }
//            rest1.setItems(itemList);
//            System.out.println("Please enter the Spice Level");
//            rest1.setSpiceLevel(input.next());
//            System.out.println("Any Special notes");
//            input.nextLine();
//            rest1.setSpecialNotes(input.nextLine());
//            restaurants.add(rest1);
//            deliveryAppName.setRestaurants(restaurants);
//            System.out.println(deliveryAppName.getRestaurants());
////            System.out.println(deliveryAppName.getDeliveryAppName());
//            priceOfOrderedItems= getPriceOfItem(cuisineType);
//            totalbill.setPriceOfItem(priceOfOrderedItems);
//            deliveryAppName.setTotal(totalbill);
//            System.out.println(deliveryAppName.getTotal());
//        }
//        else if(cuisineType.equals("FastFood")){
//            FastFoodRestaurant rest1 = new FastFoodRestaurant();
//            System.out.println("Please enter the name of FastFood Restaurant");
//            rest1.setName(input.next());
//            System.out.println("Please Enter Food Item to be ordered");
//            rest1.setItem(input.next());
//            System.out.println("Please enter the Spice Level");
//            rest1.setSpiceLevel(input.next());
//            System.out.println("Any Special notes");
//            input.nextLine();
//            rest1.setSpecialNotes(input.nextLine());
//            System.out.println("Ketchup Packets");
//            rest1.setKetchupPackets(input.nextInt());
//            System.out.println(rest1);
//            restaurants.add(rest1);
//            deliveryAppName.setRestaurants(restaurants);
//            priceOfOrderedItems = getPriceOfItem(cuisineType);
//            totalbill.setPriceOfItem(priceOfOrderedItems);
//            deliveryAppName.setTotal(totalbill);
//            System.out.println(deliveryAppName.getTotal());
//        }
        if(cuisineType.equals("Indian")) {
            IndianRestaurant2 rest1 = new IndianRestaurant2();
            System.out.println("Please enter the name of Indian Restaurant");
            rest1.setName(input.next());
            System.out.println("Please Number of Food Items to be ordered");
            int foodItemsNum = input.nextInt();
            for(int i=0;i<foodItemsNum;i++) {
                System.out.println("Please Enter Food Items to be ordered");
                foodItems = input.next();
                itemList.add(foodItems);
            }
            rest1.setItems(itemList);
            System.out.println("Please enter the Spice Level");
            rest1.setSpiceLevel(input.next());
            System.out.println("Any Special notes");
            input.nextLine();
            rest1.setSpecialNotes(input.nextLine());
            System.out.println(rest1);
            restaurants.add(rest1);
            deliveryAppName.setRestaurants(restaurants);
//            priceOfOrderedItems = getPriceOfItem(cuisineType);

            Iterator itr = itemList.iterator();
            String temp ="";
            while (itr.hasNext()){
                    temp = String.valueOf(itr.next());
                    priceOfOrderedItems+=getPriceOfItem(cuisineType,temp);
            }

            totalbill.setPriceOfItem(priceOfOrderedItems);
            deliveryAppName.setTotal(totalbill);
            System.out.println(deliveryAppName.getTotal());
        }
//        else if(cuisineType.equals("Mexican")) {
//            MexicanRestaurant rest1 = new MexicanRestaurant();
//            System.out.println("Please enter the name of Mexican Restaurant");
//            rest1.setName(input.next());
//            System.out.println("Please Enter Food Item to be ordered");
//            rest1.setItem(input.next());
//            System.out.println("Please enter the Spice Level");
//            rest1.setSpiceLevel(input.next());
//            System.out.println("Any Special notes");
//            input.nextLine();
//            rest1.setSpecialNotes(input.nextLine());
//            System.out.println("Need Chip and Salsa(true/false)");
//            rest1.isNeedChipAndSalsa(input.nextBoolean());
//            System.out.println(rest1);
//            restaurants.add(rest1);
//            deliveryAppName.setRestaurants(restaurants);
//            priceOfOrderedItems=getPriceOfItem(cuisineType);
//            totalbill.setPriceOfItem(priceOfOrderedItems);
//            deliveryAppName.setTotal(totalbill);
//            System.out.println(deliveryAppName.getTotal());
//        }
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
                getDetailsWithOrderNumber(orderingAppFilePath,orderNumber);
                break;
            default:
                System.out.println("Please select Read/Update");
                break;
        }
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
            String test = totalbill.totalCost();
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
            Files.writeString(fileName,"\n" + orderNumber + "," + deliveryApptoCVS + ',', StandardOpenOption.APPEND);
            for ( Object S : test4){
                Files.writeString(fileName,S + ",",StandardOpenOption.APPEND);
            }
            Files.writeString(fileName,test,StandardOpenOption.APPEND);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getDetailsWithOrderNumber(Path fileName,String orderNumber) {
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

    public static float getPriceOfItem(String restType,String item) throws IOException {
        String cuisineType = restType;
        String restItem = item;

        Map<String, Float> orderDetails = new HashMap<>();
        String readFile = "";
        String eachLine = "";
        String temp5 = "";
        String temp6;
        if(cuisineType.equals("Chinese")){
            System.out.println("Reading Chinese Restaurant Menu");
            for(int x =0;x<Files.readAllLines(chineseMenu).size();x++) {
                eachLine = Files.readAllLines(chineseMenu).get(x);
                String[] arrayEachLine = eachLine.split(" ");
                temp5 = arrayEachLine[0];
                temp6 = arrayEachLine[1];
                float price = Float.parseFloat(temp6);
                orderDetails.put(temp5,price);
            }
            return orderDetails.get(deliveryAppName.getRestaurants().get(0).getItems());
        }
        else if(cuisineType.equals("Indian")){
            System.out.println("Reading Indian Restaurant Menu");
            for(int x =0;x<Files.readAllLines(indianMenu).size();x++) {
                eachLine = Files.readAllLines(indianMenu).get(x);
                String[] arrayEachLine = eachLine.split(" ");
                if(arrayEachLine[0].equals(restItem)) {
                    temp5 = arrayEachLine[0];
                    temp6 = arrayEachLine[1];
                    float price = Float.parseFloat(temp6);
                    orderDetails.put(temp5,price);
                }
            }
            return orderDetails.get(item);
        }
//        else if(cuisineType.equals("FastFood")){
//            System.out.println("Reading FastFood Restaurant Menu");
//            for(int x =0;x<Files.readAllLines(fastFastMenu).size();x++) {
//                eachLine = Files.readAllLines(fastFastMenu).get(x);
//                String[] arrayEachLine = eachLine.split(" ");
//                temp5 = arrayEachLine[0];
//                temp6 = arrayEachLine[1];
//                float price = Float.parseFloat(temp6);
//                orderDetails.put(temp5,price);
//            }
//            return orderDetails.get(deliveryAppName.getRestaurants().get(0).getItem());
//        }
//        else if(cuisineType.equals("Mexican")){
//            System.out.println("Reading Mexican Restaurant Menu");
//            for(int x =0;x<Files.readAllLines(mexicanMenu).size();x++) {
//                eachLine = Files.readAllLines(mexicanMenu).get(x);
//                String[] arrayEachLine = eachLine.split(" ");
//                temp5 = arrayEachLine[0];
//                temp6 = arrayEachLine[1];
//                float price = Float.parseFloat(temp6);
//                orderDetails.put(temp5,price);
//            }
//            return orderDetails.get(deliveryAppName.getRestaurants().get(0).getItem());
//        }
        return orderDetails.get(temp5);
    }

}
