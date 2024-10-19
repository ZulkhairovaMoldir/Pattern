package Assignment4.Observer;
// Интерфейс который описывает методы упарвления подписками
public interface NewsPublisher {
    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers(String topic, String news);
    void publishNews(String topic, String news);
}
