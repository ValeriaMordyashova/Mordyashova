package org.example.config;
import org.example.Car;
import org.example.Employee;
import org.example.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
    @Value("Config work")
    private String key;

    @Bean
    public Car car() {
        return new Car("Toyota", "Camry");
    }

    @Bean
    public Pet pet() {
        return new Pet("Fido", "Dog");
    }

    @Bean
    @Autowired
    @Scope("singleton")
    public Employee employee(@Qualifier("car") Car car, // Использование @Qualifier для явного указания бина
                             @Qualifier("pet") Pet pet) {
        return new Employee("John Doe", 30, car(), pet());
    }
}
