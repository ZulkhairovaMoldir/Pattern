package org.example.abstractFactory;

// Создаеться вид зерен

public class ArabicaBeans implements Beans {
    @Override
    public String getBeansType(){
        return "зерна Арабика";
    }
}

