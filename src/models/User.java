package models;

public class User {
    private String username;
    private String contactInfo;

    public User(String username, String contactInfo) {
        this.username = username;
        this.contactInfo = contactInfo;
    }

    public String getUsername() { return username; }
    public String getContactInfo() { return contactInfo; }

    public void setUsername(String username) { this.username = username; }
    public void setContactInfo(String contactInfo) { this.contactInfo = contactInfo; }
}
