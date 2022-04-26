package restaurant;

import java.util.Iterator;
import java.util.Set;

public class IndianRestaurant2 extends Restaurant2{

    public IndianRestaurant2() {
    }

    public IndianRestaurant2(String name, String spiceLevel, String specialNotes, Set<String> items) {
        super(name, spiceLevel, specialNotes, items);
    }

    @Override
    public String toString() {
        Iterator itr = getItems().iterator();
        String temp ="";
        while (itr.hasNext()){
            temp += String.valueOf(itr.next()) + "#";
        }
        return getName() + "," + getSpiceLevel() + "," + getSpecialNotes() + "," + temp;
    }
}
