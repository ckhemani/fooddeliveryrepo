package restaurant;

public class FastFoodRestaurant extends Restaurant{
    private int ketchupPackets;

    public FastFoodRestaurant() {
    }

    public FastFoodRestaurant(String name, String item, String spiceLevel, String specialNotes, int ketchupPackets) {
        super(name, item, spiceLevel, specialNotes);
        this.ketchupPackets = ketchupPackets;
    }

    public int getKetchupPackets() {
        return ketchupPackets;
    }

    public void setKetchupPackets(int ketchupPackets) {
        this.ketchupPackets = ketchupPackets;
    }

    public String toCvsFile() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }

    @Override
    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }
//    public String toString() {
//        return "FastFoodRestaurantname ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", ketchupPackets=" + ketchupPackets;
//    }

}
