package org.example;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;


@Scope("prototype") // Пример настройки области бина
public class Employee {
    @Value("${employee.name}")
    private String name;

    @Value("${employee.age}")
    private int age;
    private Car car;
    private Pet pet;

    public Employee(String name, int age, Car car, Pet pet) {
        this.name = name;
        this.age = age;
        this.car = car;
        this.pet = pet;
}
    public String getEmp(){
        return name +" ";
    }
    public int getEmpl(){
        return age;
    }

    public void setCar(String name, int age, Car car, Pet pet)  {
        this.name = name;
        this.age = age;
        this.car = car;
        this.pet = pet;
    }
    @PostConstruct
    public void init() {
        System.out.println("Employee init() method");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Employee destroy() method");
    }
}
