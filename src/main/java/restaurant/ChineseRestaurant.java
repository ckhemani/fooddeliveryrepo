package restaurant;

public class ChineseRestaurant extends Restaurant{
    private int fortuneCookiepPackets;
    private int hotSaucePackets;

    public ChineseRestaurant() {
    }

    public ChineseRestaurant(String name, String item, String spiceLevel, String specialNotes, int fortuneCookiepPackets, int hotSaucePackets) {
        super(name, item, spiceLevel, specialNotes);
        this.fortuneCookiepPackets = fortuneCookiepPackets;
        this.hotSaucePackets = hotSaucePackets;
    }

    public int getFortuneCookiepPackets() {
        return fortuneCookiepPackets;
    }

    public void setFortuneCookiepPackets(int fortuneCookiepPackets) {
        this.fortuneCookiepPackets = fortuneCookiepPackets;
    }

    public int getHotSaucePackets() {
        return hotSaucePackets;
    }

    public void setHotSaucePackets(int hotSaucePackets) {
        this.hotSaucePackets = hotSaucePackets;
    }

    @Override
    public String toString() {
        return "ChineseRestaurant{" +
                "name ='" + name + '\'' +
                ", item='" + item + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                ", fortuneCookiepPackets=" + fortuneCookiepPackets +
                ", hotSaucePackets=" + hotSaucePackets +
                '}';
    }
}
