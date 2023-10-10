package org.example.controller;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

@Component
@RestController
public class EmployeeController
{
    @GetMapping("/hello")
    public String hello(String name) {
        if (name == null) {
            return "Hello world!";
        } else {
            return "Hello " + name + "!";
        }
    }

    @GetMapping("/about")
    public String about() {
        return "about us";
    }

    @GetMapping("/options")
    public String options(String param) {
        if (param != null) {
            return "not an option";
        } else {
            return "options";
        }
    }
}

