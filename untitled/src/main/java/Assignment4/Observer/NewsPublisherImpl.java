package Assignment4.Observer;

import java.util.ArrayList;
import java.util.List;

// Реализация методов из NewsPublisher
public class NewsPublisherImpl implements NewsPublisher{

    private List<Observer> observers = new ArrayList<>();

    @Override
    public void subscribe(Observer observer){
        observers.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer){
        observers.remove(observer);
    }
    @Override
    public void notifyObservers(String topic, String news){
        for (Observer observer : observers) {
            observer.update(topic, news);
        }
    }
    @Override
    public void publishNews(String topic, String news){

        System.out.println("Тема: " + topic + " — " + news);
        notifyObservers(topic, news);
    }
}
