package org.example.abstractFactory;

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
