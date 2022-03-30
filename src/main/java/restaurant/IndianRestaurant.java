package restaurant;

public class IndianRestaurant extends Restaurant{
    int chutneyPackets;

    public IndianRestaurant(String item, String description, String spiceLevel, String specialNotes, int chutneyPackets) {
        super(item, description, spiceLevel, specialNotes);
        this.chutneyPackets = chutneyPackets;
    }

    public int getChutneyPackets() {
        return chutneyPackets;
    }

    @Override
    public String toString() {
        return "IndianRestaurant{" +
                "chutneyPackets=" + chutneyPackets +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }

    public void setChutneyPackets(int chutneyPackets) {
        this.chutneyPackets = chutneyPackets;
    }
}
