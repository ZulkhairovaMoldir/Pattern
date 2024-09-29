package org.example.factoryMethod;

// Возвращает эспресса с помощью метода

public class EspreccaFactory extends CoffeeFactory{
    @Override
    public Esprecca createCoffee(){
        return new Esprecca();
    }
}
