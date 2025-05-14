package services;

import models.Item;

import java.util.List;

public interface LostAndFoundService {
    void reportItem(Item item);
    List<Item> searchItems(String keyword);
}
