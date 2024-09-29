package org.example.builder;

public class Barista {
    private CoffeeBuilder coffeeBuilder;

    public void setCoffeeBuilder(CoffeeBuilder cf) {
        coffeeBuilder = cf;
    }

    public Coffee getCoffee() {
        return coffeeBuilder.getCoffee();
    }

    public void constructCoffee() {
        coffeeBuilder.buildBeans();
        coffeeBuilder.buildSyrup();
        coffeeBuilder.buildMilk();
        coffeeBuilder.buildAddition();
    }
}
