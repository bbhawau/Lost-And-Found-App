package models;

public abstract class Item {
    private String name;
    private String description;
    private String location;

    public Item(String name, String description, String location) {
        this.name = name;
        this.description = description;
        this.location = location;
    }

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getLocation() { return location; }

    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setLocation(String location) { this.location = location; }

    public abstract String getType();
}
