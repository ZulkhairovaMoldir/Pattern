package org.example.factoryMethod;

public class LatteFactory extends CoffeeFactory{
   @Override
    public Latte createCoffee(){
       return new Latte();
   }
}
