package deliveryapp;

import customer.Customer;
import driver.Driver;
import restaurant.Restaurant;
import totalbill.TotalBill;


import java.util.ArrayList;

public class DeliveryApp {
    private String deliveryAppName;
    private Customer orderingAppCustomer;
    private Driver deliveryAppDriverName;
    private ArrayList<Restaurant> restaurants;
    private TotalBill total;


    public DeliveryApp(String deliveryAppName, Customer orderingAppCustomer, Driver deliveryAppDriverName, ArrayList<Restaurant> restaurants, TotalBill total) {
        this.deliveryAppName = deliveryAppName;
        this.orderingAppCustomer = orderingAppCustomer;
        this.deliveryAppDriverName = deliveryAppDriverName;
        this.restaurants = restaurants;
        this.total = total;
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

    public TotalBill getTotal() {
        return total;
    }

    public void setTotal(TotalBill total) {
        this.total = total;
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
