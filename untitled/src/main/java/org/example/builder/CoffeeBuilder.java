package org.example.builder;

public interface CoffeeBuilder {
    void buildBeans();
    void buildSyrup();
    void buildMilk();
    void buildAddition();
    Coffee getCoffee();
}
