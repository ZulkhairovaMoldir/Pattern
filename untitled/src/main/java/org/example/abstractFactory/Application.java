package org.example.abstractFactory;

public class Application {
    private Beans beans;
    private Milk milk;


    public Application(CoffeeIngredientsFactory factory) {
        beans = factory.createBeans();
        milk = factory.createMilk();
    }

    public void useType() {
            System.out.println("Ингредиенты: " + beans.getBeansType() + " и " + milk.getMilkType());
    }
}
