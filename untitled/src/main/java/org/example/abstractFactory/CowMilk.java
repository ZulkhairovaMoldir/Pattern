package org.example.abstractFactory;

public class CowMilk implements Milk{
    @Override
    public String getMilkType(){
        return "Коровье молоко";
    }
}

