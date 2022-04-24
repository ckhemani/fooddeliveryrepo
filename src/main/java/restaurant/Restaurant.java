package restaurant;

public class Restaurant {
    String name;
    String item;
    String spiceLevel;
    String specialNotes;

    public Restaurant() {
    }

    public Restaurant(String name, String item, String spiceLevel, String specialNotes) {
        this.name = name;
        this.item = item;
        this.spiceLevel = spiceLevel;
        this.specialNotes = specialNotes;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
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

    @Override
    public String toString() {
        return  getName() + "," + getItem() + "," + getSpiceLevel() + "," + getSpecialNotes();
    }
}


