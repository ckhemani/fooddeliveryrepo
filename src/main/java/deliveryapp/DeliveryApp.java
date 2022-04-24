package deliveryapp;

import customer.Customer;
import driver.Driver;
import restaurant.Restaurant;
import totalbill.TotalBill;


import java.util.ArrayList;

public class DeliveryApp {
    private String deliveryAppName;
    private Customer orderingAppCustomer;
    private Driver deliveryAppDriver;
    private ArrayList<Restaurant> restaurants;
    private TotalBill total;

    public DeliveryApp() {
    }

    public DeliveryApp(String deliveryAppName, Customer orderingAppCustomer, Driver deliveryAppDriver, ArrayList<Restaurant> restaurants, TotalBill total) {
        this.deliveryAppName = deliveryAppName;
        this.orderingAppCustomer = orderingAppCustomer;
        this.deliveryAppDriver = deliveryAppDriver;
        this.restaurants = restaurants;
        this.total = total;
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

    public Driver getDeliveryAppDriver() {
        return deliveryAppDriver;
    }

    public void setDeliveryAppDriver(Driver deliveryAppDriver) {
        this.deliveryAppDriver = deliveryAppDriver;
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
        return  "deliveryAppName='" + deliveryAppName + '\'' +
                ", orderingAppCustomer=" + orderingAppCustomer +
                ", deliveryAppDriverName=" + deliveryAppDriver +
                ", restaurants=" + restaurants ;
    }

    public String toCvsFile(){
        return getDeliveryAppName() + "," + getDeliveryAppDriver().toCvsFile() + "," + getOrderingAppCustomer().toCvsFile();
    }
}
