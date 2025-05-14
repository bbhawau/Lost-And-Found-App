package models;

public class FoundItem extends Item {
    public FoundItem(String name, String description, String location) {
        super(name, description, location);
    }

    @Override
    public String getType() {
        return "Found";
    }
}
