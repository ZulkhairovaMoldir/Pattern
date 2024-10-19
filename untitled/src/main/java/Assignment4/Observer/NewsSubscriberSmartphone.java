package Assignment4.Observer;

// Переписала медот под подребности
// Чтобы при определенном разделе выводили определенное сообщение
public class NewsSubscriberSmartphone implements Observer {
    @Override
    public void update(String topic, String news) {
        if ("Наука".equals(topic)) {
            System.out.println("Уведомление на ноутбук: " + news);
        }
    }
}
