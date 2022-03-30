package restaurant;

public class ChineseRestaurant extends Restaurant{
    private int fortuneCookiepPackets;
    private int hotsaucePackets;

    public ChineseRestaurant(String item, String description, String spiceLevel, String specialNotes, int fortuneCookiepPackets, int hotsaucePackets) {
        super(item, description, spiceLevel, specialNotes);
        this.fortuneCookiepPackets = fortuneCookiepPackets;
        this.hotsaucePackets = hotsaucePackets;
    }

    public int getFortuneCookiepPackets() {
        return fortuneCookiepPackets;
    }

    public void setFortuneCookiepPackets(int fortuneCookiepPackets) {
        this.fortuneCookiepPackets = fortuneCookiepPackets;
    }

    public int getHotsaucePackets() {
        return hotsaucePackets;
    }

    public void setHotsaucePackets(int hotsaucePackets) {
        this.hotsaucePackets = hotsaucePackets;
    }

    @Override
    public String toString() {
        return "ChineseRestaurant{" +
                "fortuneCookiepPackets=" + fortuneCookiepPackets +
                ", hotsaucePackets=" + hotsaucePackets +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}
