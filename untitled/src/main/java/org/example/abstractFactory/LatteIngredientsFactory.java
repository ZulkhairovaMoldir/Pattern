package org.example.abstractFactory;

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
