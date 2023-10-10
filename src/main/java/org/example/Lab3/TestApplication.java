package org.example.Lab3;


import java.util.List;

public class TestApplication {
    public static void main(String[] args) {

        Warehouse warehouse = Warehouse.getInstance();
        Aspect aspect = new Aspect();

        Item book = new Book("Java: Полный справочник");
        Item laptop = new ElectronicDevice("Ноутбук");
        Item shirt = new Clothing("Футболочка");

        // Применение Aspect для метода sendToWarehouse
        aspect.beforeAdvice();
        book.sendToWarehouse(warehouse);
        aspect.afterReturningAdvice("Успешно добавлено на склад");
        aspect.afterFinallyAdvice();

        // Применение Aspect с исключением
        aspect.beforeAdvice();
        try {
            throwExceptionMethod();
        } catch (Exception e) {
            aspect.afterThrowingAdvice(e);
        } finally {
            aspect.afterFinallyAdvice();
        }

        // Применение Aspect с использованием Around Advice
        aspect.aroundAdvice();
        laptop.sendToWarehouse(warehouse);
        aspect.aroundAdvice();

        // Получение сигнатуры и переменных метода при получении предметов
        retrieveItemFromWarehouse(warehouse, book, aspect);
        retrieveItemFromWarehouse(warehouse, shirt, aspect);
        retrieveItemFromWarehouse(warehouse, laptop, aspect);

        // Применение Aspect для метода sendToWarehouse
        aspect.beforeAdvice();
        shirt.sendToWarehouse(warehouse);
        aspect.afterReturningAdvice("Успешно добавлено на склад");
        aspect.afterFinallyAdvice();


    }

    private static void retrieveItemFromWarehouse(Warehouse warehouse, Item item, Aspect aspect) {
        aspect.beforeAdvice();

        // Логика получения предмета со склада
        List<Item> itemsOnWarehouse = warehouse.getItems();
        if (itemsOnWarehouse.contains(item)) {
            itemsOnWarehouse.remove(item);
            System.out.println("Получен предмет с склада: " + item.getName());
            aspect.afterReturningAdvice("Успешно получен предмет");
            aspect.afterFinallyAdvice();
        } else {
            System.out.println("Предмет " + item.getName() + " отсутствует на складе.");
        }
    }

    private static void throwExceptionMethod() throws Exception {
        throw new Exception("Исключение в методе");
    }

}