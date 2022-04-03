package deliveryapp;

import customer.Customer;
import driver.Driver;
import restaurant.Restaurant;


import java.util.ArrayList;

public class DeliveryApp {
    private String deliveryAppName;
    private Customer orderingAppCustomer;
    private Driver deliveryAppDriverName;
    private ArrayList<Restaurant> restaurants = new ArrayList<>();


    public DeliveryApp(String deliveryAppName, Customer orderingAppCustomer, Driver deliveryAppDriverName, ArrayList<Restaurant> restaurants) {
        this.deliveryAppName = deliveryAppName;
        this.orderingAppCustomer = orderingAppCustomer;
        this.deliveryAppDriverName = deliveryAppDriverName;
        this.restaurants = restaurants;
    }

    public DeliveryApp(String deliveryAppName) {
        this.deliveryAppName = deliveryAppName;
    }

    public String getDeliveryAppName() {
        return deliveryAppName;
    }

    public void setDeliveryAppName(String deliveryAppName) {
        this.deliveryAppName = deliveryAppName;
    }

    public Customer getOrderingAppCustomer() {
        return orderingAppCustomer;
    }

    public void setOrderingAppCustomer(Customer orderingAppCustomer) {
        this.orderingAppCustomer = orderingAppCustomer;
    }

    public Driver getDeliveryAppDriverName() {
        return deliveryAppDriverName;
    }

    public void setDeliveryAppDriverName(Driver deliveryAppDriverName) {
        this.deliveryAppDriverName = deliveryAppDriverName;
    }


    public ArrayList<Restaurant> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant> restaurants) {
        this.restaurants = restaurants;
    }


    @Override
    public String toString() {
        return "DeliveryApp{" +
                "deliveryAppName='" + deliveryAppName + '\'' +
                ", orderingAppCustomer=" + orderingAppCustomer +
                ", deliveryAppDriverName=" + deliveryAppDriverName +
                ", restaurants=" + restaurants +
                '}';
    }
}
