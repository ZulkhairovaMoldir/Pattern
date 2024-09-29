package org.example.builder;

// Создаеться новый кофе эспресса с помощью внесением названия ингредиентов и вызывом кофе

public class EspreccaBuilder implements CoffeeBuilder{
    private Coffee coffee;

    public EspreccaBuilder() {
        coffee = new Coffee();
    }

    @Override
    public void buildBeans() {coffee.setBeans("Либерское зерно");}
    @Override
    public void buildSyrup(){
        coffee.setSyrup("Карамельный сироп");
    }
    @Override
    public void buildMilk(){
        coffee.setMilk("Коровье молоко");
    }
    @Override
    public void buildAddition(){
        coffee.setAddition("Корица");
    }

    @Override
    public Coffee getCoffee() {
        return coffee;
    }
}
