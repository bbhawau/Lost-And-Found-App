package services;

import models.Item;

import java.util.ArrayList;
import java.util.List;

public class LostAndFoundManager implements LostAndFoundService {
    private List<Item> items;

    public LostAndFoundManager() {
        items = new ArrayList<>();
    }

    @Override
    public void reportItem(Item item) {
        items.add(item);
        System.out.println(item.getType() + " item reported: " + item.getName());
    }

    @Override
    public List<Item> searchItems(String keyword) {
        List<Item> results = new ArrayList<>();
        for (Item item : items) {
            if (item.getName().toLowerCase().contains(keyword.toLowerCase()) ||
                item.getDescription().toLowerCase().contains(keyword.toLowerCase()) ||
                item.getLocation().toLowerCase().contains(keyword.toLowerCase())) {
                results.add(item);
            }
        }
        return results;
    }
}
