package restaurant;

public class ChineseRestaurant extends Restaurant{
    private int fortuneCookiepPackets;

    public ChineseRestaurant() {
    }

    public ChineseRestaurant(String name, String item, String spiceLevel, String specialNotes, int fortuneCookiepPackets) {
        super(name, item, spiceLevel, specialNotes);
        this.fortuneCookiepPackets = fortuneCookiepPackets;

    }

    public int getFortuneCookiepPackets() {
        return fortuneCookiepPackets;
    }

    public void setFortuneCookiepPackets(int fortuneCookiepPackets) {
        this.fortuneCookiepPackets = fortuneCookiepPackets;
    }


    public String toCvsFile() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }

    @Override
//    public String toString() {
//        return "ChineseRestaurant{" +
//                "name ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", fortuneCookiepPackets=" + fortuneCookiepPackets +
//                '}';
//    }


    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes() ;
    }

}
