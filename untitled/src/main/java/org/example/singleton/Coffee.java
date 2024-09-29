package org.example.singleton;


public class Coffee {
    private static Coffee instance;

    private Coffee(){}

    public static Coffee getInstance(){
        if (instance == null) {
            instance = new Coffee();
        }
        return instance;
    }

    public void createOrder(int id,String customerName, String coffeeType,int price) {
        System.out.println("Заказ Принять! "+"номер:"+id + " имя:"+customerName + " кофе:" + coffeeType+" цена:"+price);
    }


    public void cancelOrder(String customerName,int id) {
        System.out.println("Заказ Отменен! "+"номер:"+id + " имя:"+customerName);
    }
}
