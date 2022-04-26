package deliveryapp;

import customer.Customer;
import driver.Driver;
import restaurant.Restaurant2;
import totalbill.TotalBill;

import java.util.ArrayList;

public class DeliveryApp2 {
    private String deliveryAppName;
    private Customer orderingAppCustomer;
    private Driver deliveryAppDriver;
    private ArrayList<Restaurant2> restaurants;
    private TotalBill total;

    public DeliveryApp2() {
    }

    public DeliveryApp2(String deliveryAppName, Customer orderingAppCustomer, Driver deliveryAppDriver, ArrayList<Restaurant2> restaurants, TotalBill total) {
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

    public ArrayList<Restaurant2> getRestaurants() {
        return restaurants;
    }

    public void setRestaurants(ArrayList<Restaurant2> restaurants) {
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
        return "DeliveryApp2{" +
                "deliveryAppName='" + deliveryAppName + '\'' +
                ", orderingAppCustomer=" + orderingAppCustomer +
                ", deliveryAppDriver=" + deliveryAppDriver +
                ", restaurants=" + restaurants +
                ", total=" + total +
                '}';
    }

    public String toCvsFile(){
        return getDeliveryAppName() + "," + getDeliveryAppDriver().toCvsFile() + "," + getOrderingAppCustomer().toCvsFile();
    }
}
