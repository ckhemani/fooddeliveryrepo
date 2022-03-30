package restaurant;

public class FastFoodRestaurant extends Restaurant{
    private int ketchupPackets;

    public FastFoodRestaurant(String item, String description, String spiceLevel, String specialNotes, int ketchupPackets) {
        super(item, description, spiceLevel, specialNotes);
        this.ketchupPackets = ketchupPackets;
    }

    public int getKetchupPackets() {
        return ketchupPackets;
    }

    public void setKetchupPackets(int ketchupPackets) {
        this.ketchupPackets = ketchupPackets;
    }

    @Override
    public String toString() {
        return "FastFoodRestaurant{" +
                "ketchupPackets=" + ketchupPackets +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}
