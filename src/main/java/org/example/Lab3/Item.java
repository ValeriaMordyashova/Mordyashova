package org.example.Lab3;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


public class Item implements Storable {
    private String name;

    public Item(String name) {
        this.name = name;
    }

    @Override
    public void sendToWarehouse(Warehouse warehouse) {
        warehouse.putOnWarehouse(this);
    }

    public String getName() {
        return name;
    }
}
