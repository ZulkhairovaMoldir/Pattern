package Assignment4.Observer;

//Интерфейс для новостей
public interface Observer {
    //Медот для получение обновлений
    void update(String topic,String news);
}
