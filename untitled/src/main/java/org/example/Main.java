package org.example;

import org.example.abstractFactory.Application;
import org.example.abstractFactory.CoffeeIngredientsFactory;
import org.example.abstractFactory.EspreccaIngredientsFactory;
import org.example.abstractFactory.LatteIngredientsFactory;
import org.example.builder.Barista;
import org.example.builder.CoffeeBuilder;
import org.example.builder.EspreccaBuilder;
import org.example.builder.IceLatteBuilder;
import org.example.factoryMethod.CoffeeFactory;
import org.example.factoryMethod.EspreccaFactory;
import org.example.factoryMethod.LatteFactory;
import org.example.prototype.Order;
import org.example.prototype.OrderRegistry;
import org.example.singleton.Coffee;



public class Main {
    public static void main(String[] args) {

        //Singleton
        Coffee coffeeShop = Coffee.getInstance();

        coffeeShop.createOrder(1, "Зулхаирова Молдир","Капучина",1200);
        coffeeShop.createOrder(2, "Макенова Медина","Латте",1450);

        coffeeShop.cancelOrder("Зулхаирова Молдир",1);
        coffeeShop.createOrder(3, "Зулхаирова Молдир","Латте",1450);

        Coffee coffeeShop2 = Coffee.getInstance();
        System.out.println(coffeeShop == coffeeShop2);

        //Factory
        CoffeeFactory latteFactory = new LatteFactory();
        latteFactory.prepareCoffee();

        CoffeeFactory espreccaFactory = new EspreccaFactory();
        espreccaFactory.prepareCoffee();

        //Abstract Factory
        CoffeeIngredientsFactory latteIngredientsFactory = new LatteIngredientsFactory();
        CoffeeIngredientsFactory espreccaIngredientsFactory = new EspreccaIngredientsFactory();

        Application latte = new Application(latteIngredientsFactory);


        String os = "Latte";

        CoffeeIngredientsFactory factory;

        if (os.equals("Latte")) {
            factory = new LatteIngredientsFactory();
        } else {
            factory = new EspreccaIngredientsFactory();
        }

        Application coffee = new Application(factory);
        coffee.useType();

        //Prototype

        OrderRegistry registry = new OrderRegistry();

        Order order1 = registry.createOrder("Cappuccino");
        System.out.println(order1);

        Order order2 = registry.createOrder("Icelatte");
        System.out.println(order2);

        //Builder

        Barista barista = new Barista();

        CoffeeBuilder espreccaBuilder = new EspreccaBuilder();
        barista.setCoffeeBuilder(espreccaBuilder);
        barista.constructCoffee();
        org.example.builder.Coffee esprecca = barista.getCoffee();
        esprecca.showIngredients();

        CoffeeBuilder iceLatteBuilder = new IceLatteBuilder();
        barista.setCoffeeBuilder(iceLatteBuilder);
        barista.constructCoffee();
        org.example.builder.Coffee iceLatte = barista.getCoffee();
        iceLatte.showIngredients();
    }
}

