package Assignment4.Observer;

// Переписала медот под подребности
// Чтобы при определенном разделе выводили определенное сообщение

public class NewsSubscriberTablet implements Observer{
    @Override
    public void update(String topic, String news) {
        if ("Новости".equals(topic)) {
            System.out.println("Уведомление на планшете: " + news);
        }
    }
}
