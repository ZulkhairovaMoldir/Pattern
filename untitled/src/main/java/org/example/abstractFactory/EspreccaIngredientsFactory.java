package org.example.abstractFactory;

// Создаеться фабрика эспресса который создает кофе из определенные ингредиентов

public class EspreccaIngredientsFactory  implements CoffeeIngredientsFactory{
    @Override
    public Milk createMilk() {
        return new OatMilk();
    }
    @Override
    public Beans createBeans() {
        return new LibericaBeans();
    }
}
