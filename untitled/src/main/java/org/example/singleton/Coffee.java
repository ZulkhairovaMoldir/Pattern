package org.example.singleton;

//
//

public class Coffee {
    private static Coffee instance;   // Переменная для хранения единственного экземпляра класса

    private Coffee(){} // Приватный конструктор, предотвращающий создание объектов извне.

    // Чтобы точна был создан один экземпляр
    public static Coffee getInstance(){
        if (instance == null) { // Проверка, существует ли уже экземпляр; если нет, создаем его
            instance = new Coffee();
        }
        return instance;
    }

    // Метод для создания заказа с указанием параметров.
    public void createOrder(int id,String customerName, String coffeeType,int price) {
        System.out.println("Заказ Принять! "+"номер:"+id + " имя:"+customerName + " кофе:" + coffeeType+" цена:"+price);
    }

    // Метод для отмены заказа по имени клиента и идентификатору.
    public void cancelOrder(String customerName,int id) {
        System.out.println("Заказ Отменен! "+"номер:"+id + " имя:"+customerName);
    }
}
