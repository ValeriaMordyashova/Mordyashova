package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Pet {
    private String name;
    private String species;

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
}
    public String getPet(){
        return name +" " + species;
    }
    public String setPet(String name, String species) {
        this.name = name;
        this.species = species;
        return name + species;
    }
    @PostConstruct
    public void init() {
        System.out.println("Pet init() method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Pet destroy() method");
    }
}
