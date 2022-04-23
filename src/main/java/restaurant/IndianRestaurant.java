package restaurant;

public class IndianRestaurant extends Restaurant{
    int chutneyPackets;

    public IndianRestaurant() {
    }

    public IndianRestaurant(String name, String item, String spiceLevel, String specialNotes, int chutneyPackets) {
        super(name, item, spiceLevel, specialNotes);
        this.chutneyPackets = chutneyPackets;
    }

    public int getChutneyPackets() {
        return chutneyPackets;
    }

    public void setChutneyPackets(int chutneyPackets) {
        this.chutneyPackets = chutneyPackets;
    }

    public String toCvsFile() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes() + "," + chutneyPackets;
    }

    @Override
    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }
//    public String toString() {
//        return "IndianRestaurantName ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", chutneyPackets=" + chutneyPackets;
//    }
//    public String toString() {
//        return "IndianRestaurant{" +
//                "name ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", chutneyPackets=" + chutneyPackets +
//                '}';
//    }
}
