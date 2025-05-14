import models.*;
import services.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        LostAndFoundService service = new LostAndFoundManager();

        User alice = new User("Alice", "alice@example.com");
        User bob = new User("Bob", "bob@example.com");

        service.reportItem(new LostItem("Wallet", "Black leather wallet", "Library"));
        service.reportItem(new FoundItem("Keys", "Car keys with a red keychain", "Cafeteria"));

        List<Item> searchResults = service.searchItems("key");
        System.out.println("\nSearch Results:");
        for (Item item : searchResults) {
            System.out.println("- " + item.getType() + ": " + item.getName() + " (" + item.getLocation() + ")");
        }
    }
}
