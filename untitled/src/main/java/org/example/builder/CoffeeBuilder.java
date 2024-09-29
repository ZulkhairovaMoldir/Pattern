package org.example.builder;

// Для создания кофе методы с которыеми мы может выбрать тип и метод который вызывает состав кофе

public interface CoffeeBuilder {
    void buildBeans();
    void buildSyrup();
    void buildMilk();
    void buildAddition();
    Coffee getCoffee();
}
