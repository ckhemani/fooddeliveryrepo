package restaurant;

public class MexicanRestaurant extends Restaurant{
    boolean needChipAndSalsa;

    public MexicanRestaurant(String item, String description, String spiceLevel, String specialNotes, boolean needChipAndSalsa) {
        super(item, description, spiceLevel, specialNotes);
        this.needChipAndSalsa = needChipAndSalsa;
    }

    public boolean isNeedChipAndSalsa() {
        return needChipAndSalsa;
    }

    @Override
    public String toString() {
        return "MexicanRestaurant{" +
                "needChipAndSalsa=" + needChipAndSalsa +
                ", item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }

    public void setNeedChipAndSalsa(boolean needChipAndSalsa) {
        this.needChipAndSalsa = needChipAndSalsa;
    }
}
