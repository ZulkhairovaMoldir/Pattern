package org.example.factoryMethod;

public class Latte implements Coffee{
    @Override
    public void  createTypeOfCoffee(){
        System.out.println("Приготовлен кофе - Латте");
    }
}
