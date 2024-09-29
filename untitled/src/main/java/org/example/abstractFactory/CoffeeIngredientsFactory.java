package org.example.abstractFactory;

// Интерфейс фабрики из которых создаються фабрики определенного вида кофе
// и которые вызываються методы для создание ингредиентов
public interface CoffeeIngredientsFactory {
    Beans createBeans();
    Milk createMilk();
}
