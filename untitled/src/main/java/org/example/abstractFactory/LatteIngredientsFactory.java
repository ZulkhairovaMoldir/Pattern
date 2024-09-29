package org.example.abstractFactory;

// Создаеться фабрика эспресса который создает кофе из определенные ингредиентов

public class LatteIngredientsFactory implements  CoffeeIngredientsFactory{
    @Override
    public Milk createMilk() {
        return new CowMilk();
    }

    @Override
    public Beans createBeans() {
        return new ArabicaBeans();
    }
}
