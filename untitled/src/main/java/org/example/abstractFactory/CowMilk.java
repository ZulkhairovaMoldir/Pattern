package org.example.abstractFactory;

// создаеться определнный вид молока
public class CowMilk implements Milk{
    @Override
    public String getMilkType(){
        return "Коровье молоко";
    }
}

