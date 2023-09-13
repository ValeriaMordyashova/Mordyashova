package org.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
       /* ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );
        Car car = context.getBean("Car", Car.class);
        System.out.println(car.getCar());

        Pet pet = context.getBean("Pet", Pet.class);
        System.out.println(pet.getPet());

        Employee emp = context.getBean("Employee", Employee.class);
        System.out.println(emp.getEmp() + emp.getEmpl() + " " + pet.getPet() + " " + car.getCar());
        context.close();
        }*/

    }


