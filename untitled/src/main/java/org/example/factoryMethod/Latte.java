package org.example.factoryMethod;

// реализующий интерфейс Coffee и выводит что кофе приготовлен.
public class Latte implements Coffee{
    @Override
    public void  createTypeOfCoffee(){
        System.out.println("Приготовлен кофе - Латте");
    }
}
