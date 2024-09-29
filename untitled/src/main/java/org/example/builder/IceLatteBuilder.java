package org.example.builder;

public class IceLatteBuilder implements CoffeeBuilder {
    private Coffee coffee;

    public IceLatteBuilder() {
        coffee = new Coffee();
    }

    @Override
    public void buildBeans() {
        coffee.setBeans("Арабское зерно");
    }

    @Override
    public void buildSyrup(){
        coffee.setSyrup("Шоколадный сироп");
    }
    @Override
    public void buildMilk(){
        coffee.setMilk("Овсяное молоко");
    }
    @Override
    public void buildAddition(){
        coffee.setAddition("Лед");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}