package restaurant;

public class ChineseRestaurant extends Restaurant{
    private int fortuneCookiepPackets;
    private int hotSaucePackets;

    public ChineseRestaurant(String item, String description, String spiceLevel, String specialNotes, int fortuneCookiepPackets, int hotSaucePackets) {
        super(item, description, spiceLevel, specialNotes);
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
                "fortuneCookiepPackets=" + fortuneCookiepPackets +
                ", hotSaucePackets=" + hotSaucePackets +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}
