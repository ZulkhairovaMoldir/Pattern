package org.example.builder;

// То что можна выбрать в кофе и метод который выводит состав

public class Coffee {
    String beans;
    String syrup;
    String milk;
    String addition;

    public void setBeans(String beans) {
        this.beans = beans;
    }

    public void setSyrup(String syrup) {
        this.syrup = syrup;
    }

    public void setMilk(String milk) {
        this.milk = milk;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public void showIngredients() {
        System.out.println("Кофе с зернами: " + beans + ", сиропом: " + syrup + ", молоком: " + milk + ", допалнение: " + addition);
    }
}

