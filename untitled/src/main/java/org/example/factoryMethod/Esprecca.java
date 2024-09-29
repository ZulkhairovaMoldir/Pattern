package org.example.factoryMethod;

// Конкретный класс Esprecca, реализующий интерфейс Coffee и выводит что кофе приготовлен.
public class Esprecca implements Coffee{
    @Override
    public void  createTypeOfCoffee(){
        System.out.println("Приготовлин кофе - Эспресса");
    }
}
