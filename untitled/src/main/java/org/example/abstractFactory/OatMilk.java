package org.example.abstractFactory;

// создаеться определнный вид молока

public class OatMilk implements Milk{
    @Override
    public String getMilkType(){
        return "Овсянное молоко";
    }
}
