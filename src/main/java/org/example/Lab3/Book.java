package org.example.Lab3;

import org.springframework.stereotype.Component;

@Component
public class Book extends Item {
    public Book(String name) {
        super(name);
    }
    public void getBook(){
        System.out.println("Книга взята");
    }
}
