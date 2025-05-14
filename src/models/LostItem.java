package models;

public class LostItem extends Item {
    public LostItem(String name, String description, String location) {
        super(name, description, location);
    }

    @Override
    public String getType() {
        return "Lost";
    }
}
