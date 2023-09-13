package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Car {
    private String make;
    private String model;

    public Car(String make, String model)  {//конструктор
        this.make = make;
        this.model = model;
    }

    public String getCar(){
        return make +" " + model;
    }
    public String setCar(String make, String model) {
        this.make = make;
        this.model = model;
        return make + model;
    }

    @PostConstruct
    public void init(){
        System.out.println("Car init method");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("Car destroy method");
    }
}

