package driver;

public class Driver {
    private String name;
    private String car;

    public Driver() {
    }

    public Driver(String name, String car) {
        this.name = name;
        this.car = car;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
//    public String toString() {
//        return "Driver{" +
//                "name='" + name + '\'' +
//                ", car='" + car + '\'' +
//                '}';
//    }
    public String toString() {
        return  "Driverame='" + name + '\'' +
                ", Drivercar='" + car + '\'' ;
    }

    public String toCvsFile() {
        return  getName() + "," + getCar();
    }

}

