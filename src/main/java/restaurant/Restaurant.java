package restaurant;

public class Restaurant {
    String item;
    String description;
    String spiceLevel;
    String specialNotes;

    public Restaurant() {
    }

    public Restaurant(String item, String description,  String spiceLevel, String specialNotes) {
        this.item = item;
        this.description = description;
        this.spiceLevel = spiceLevel;
        this.specialNotes = specialNotes;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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
        return "Restaurant{" +
                "item='" + item + '\'' +
                ", description='" + description + '\'' +
                ", spiceLevel='" + spiceLevel + '\'' +
                ", specialNotes='" + specialNotes + '\'' +
                '}';
    }
}


