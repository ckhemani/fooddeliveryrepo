package restaurant;

import java.util.Set;

public class Restaurant2 {
    private String name;
//    private String item;
    private String spiceLevel;
    private String specialNotes;
    private Set<String> items;

    public Restaurant2() {
    }

    public Restaurant2(String name, String spiceLevel, String specialNotes, Set<String> items) {
        this.name = name;
        this.spiceLevel = spiceLevel;
        this.specialNotes = specialNotes;
        this.items = items;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSpiceLevel() {
        return spiceLevel;
    }

    public void setSpiceLevel(String spiceLevel) {
        this.spiceLevel = spiceLevel;
    }

    public String getSpecialNotes() {
        return specialNotes;
    }

    public void setSpecialNotes(String specialNotes) {
        this.specialNotes = specialNotes;
    }

    public Set<String> getItems() {
        return items;
    }

    public void setItems(Set<String> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return  getName() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }
}
