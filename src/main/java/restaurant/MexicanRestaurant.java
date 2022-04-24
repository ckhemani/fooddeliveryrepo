package restaurant;

import org.w3c.dom.ls.LSOutput;

public class MexicanRestaurant extends Restaurant{
    boolean needChipAndSalsa;

    public MexicanRestaurant() {
    }

    public MexicanRestaurant(String name, String item, String spiceLevel, String specialNotes, boolean needChipAndSalsa) {
        super(name, item, spiceLevel, specialNotes);
        this.needChipAndSalsa = needChipAndSalsa;
    }

    public boolean isNeedChipAndSalsa(boolean b) {
        return needChipAndSalsa;
    }

    public void setNeedChipAndSalsa(boolean needChipAndSalsa) {
        this.needChipAndSalsa = needChipAndSalsa;
    }

    @Override
    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }

}
