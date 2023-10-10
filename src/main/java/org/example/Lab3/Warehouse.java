package org.example.Lab3;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private static final Warehouse instance = new Warehouse();
    private final List<Item> items;

    private Warehouse() {
        this.items = new ArrayList<>();
    }

    public static Warehouse getInstance() {
        return instance;
    }

    public void putOnWarehouse(Item item) {
        items.add(item);
        System.out.println(item.getName() + " помещен на склад.");
    }

    public List<Item> getItems() {
        return items;
    }
}
