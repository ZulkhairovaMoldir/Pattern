package org.example.factoryMethod;

// Абстрактный класс CoffeeFactory, который определяет метод для создания кофе и его подготовки.

public abstract class CoffeeFactory {
     public abstract Coffee createCoffee();

     public void prepareCoffee() {
         Coffee coffee = createCoffee();
         coffee.createTypeOfCoffee();
     }

}
