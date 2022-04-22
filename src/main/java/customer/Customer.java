package customer;

public class Customer {
    private String firstName;
    private String lastName;
    private String address;
    private long mobileNumber;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String address, long mobileNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.mobileNumber = mobileNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(long mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
//    public String toString() {
//        return "Customer{" +
//                "firstName='" + firstName + '\'' +
//                ", lastName='" + lastName + '\'' +
//                ", address='" + address + '\'' +
//                ", mobileNumber=" + mobileNumber +
//                '}';
//    }
    public String toString() {
        return  "CustFirstName='" + firstName + '\'' +
                ", CustLastName='" + lastName + '\'' +
                ", Custaddress='" + address + '\'' +
                ", CustobileNumber=" + mobileNumber ;
    }
}


