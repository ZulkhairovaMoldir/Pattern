package org.example.prototype;

public abstract class Order implements Cloneable {
    private String coffeeType;
    private double price;


    public Order(String coffeeType, double price) {
        this.coffeeType = coffeeType;
        this.price = price;
    }

    @Override
    public Order clone(){
        Order clone = null;
        try {
            clone = (Order) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

    @Override
    public String toString() {
        return "Заказ (" +
                "кофе= " + coffeeType +
                ", цена= " + price +
                ')';
    }
}
