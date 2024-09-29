package org.example.prototype;

import java.util.HashMap;
import java.util.Map;

// Создаеться список для сохраение заказов и вложили заказы
// Возвращает клон при создание заказа с похожим именим

public class OrderRegistry {
    private Map<String, Order> orders = new HashMap<>();

    public OrderRegistry() {
        orders.put("Cappuccino", new Cappuccino());
        orders.put("Icelatte", new IceLatte());
    }

    public Order createOrder(String coffeeType) {
        return orders.get(coffeeType).clone();
    }
}
