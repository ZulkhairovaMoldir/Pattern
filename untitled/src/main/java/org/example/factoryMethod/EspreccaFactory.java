package org.example.factoryMethod;

public class EspreccaFactory extends CoffeeFactory{
    @Override
    public Esprecca createCoffee(){
        return new Esprecca();
    }
}
