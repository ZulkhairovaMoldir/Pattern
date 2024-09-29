package org.example.factoryMethod;

public abstract class CoffeeFactory {
     public abstract Coffee createCoffee();

     public void prepareCoffee() {
         Coffee coffee = createCoffee();
         coffee.createTypeOfCoffee();
     }

}
