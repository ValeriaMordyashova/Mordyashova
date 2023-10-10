package org.example.Lab3;


public class Aspect {
    public void beforeAdvice() {
        System.out.println("Выполнение Before Advice");
    }

    public void afterReturningAdvice(Object result) {
        System.out.println("Выполнение After Returning Advice. Результат: " + result);
    }

    public void afterThrowingAdvice(Exception exception) {
        System.out.println("Выполнение After Throwing Advice. Исключение: " + exception.getMessage());
    }

    public void afterFinallyAdvice() {
        System.out.println("Выполнение After Finally Advice");
    }

    public void aroundAdvice() {
        System.out.println("Выполнение Around Advice до метода");
        System.out.println("Я бы могла придумать метод, но лучше я знаю анекдоты чем программирование");
        System.out.println("Выполнение Around Advice после метода");
    }
}
