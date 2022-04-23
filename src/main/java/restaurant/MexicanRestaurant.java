package restaurant;

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


    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }

//    @Override
//    public String toString() {
//        return "MexicanRestaurantName ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", needChipAndSalsa=" + needChipAndSalsa ;
//    }


//    public String toString() {
//        return "MexicanRestaurant{" +
//                "name ='" + name + '\'' +
//                ", item='" + item + '\'' +
//                ", spiceLevel='" + spiceLevel + '\'' +
//                ", specialNotes='" + specialNotes + '\'' +
//                ", needChipAndSalsa=" + needChipAndSalsa +", " +
//                '}';
//    }
}
