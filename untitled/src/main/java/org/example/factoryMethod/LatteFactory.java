package org.example.factoryMethod;

// Возвращает эспресса с помощью метода
public class LatteFactory extends CoffeeFactory{
   @Override
    public Latte createCoffee(){
       return new Latte();
   }
}
