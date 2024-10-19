package Assignment4.Observer;

 // Переписала медот под подребности
 // Чтобы при определенном разделе выводили определенное сообщение

public class NewsSubscriberLaptop implements Observer{
    @Override
    public void update(String topic, String news) {
        if ("Спорт".equals(topic)) {
            System.out.println("Уведомление на смартфон: " + news);
        }
    }
}
