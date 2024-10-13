package Assignment3;


import Assignment3.Chain.PaymentA;
import Assignment3.Chain.PaymentB;
import Assignment3.Chain.PaymentC;
import Assignment3.Chain.PaymentHandler;
import Assignment3.Command.*;
import Assignment3.Iterator.ArrayMovieCollection;
import Assignment3.Iterator.Iterator;
import Assignment3.Iterator.ListMovieCollection;
import Assignment3.Mediator.*;
import Assignment3.Memento.Caretaker;
import Assignment3.Memento.TextEditor;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Chain
        PaymentHandler handlerA = new PaymentA();
        PaymentHandler handlerB = new PaymentB();
        PaymentHandler handlerC = new PaymentC();

        handlerA.setNext(handlerB).setNext(handlerC);

        int price = 210;

        boolean result = handlerA.handle(price);
        if (result) {
            System.out.println("Покупка прошла");
        } else {
            System.out.println("Покупка не прошла");
        }

        //Command

        Television tv = new Television();

        RemoteControl controller = new RemoteControl();

        // Добавляем команды для управления
        controller.setCommand("nextChannel", new NextChannelCommand(tv));
        controller.setCommand("previousChannel", new PreviousChannelCommand(tv));
        controller.setCommand("turnOff", new TurnOffCommand(tv));
        controller.setCommand("turnOn", new TurnOnCommand(tv));
        controller.setCommand("volumeUp", new VolumeUpCommand(tv));
        controller.setCommand("volumeDown", new VolumeDownCommand(tv));

        // Выполняем команды
        controller.buttonPressed("nextChannel");
        controller.buttonPressed("previousChannel");
        controller.buttonPressed("turnOff");
        controller.buttonPressed("turnOn");
        controller.buttonPressed("volumeUp");
        controller.buttonPressed("volumeDown");

        //Iterator

        List<String> list = Arrays.asList("Дедпул", "Дедпул 2", "Дедпул и Росамаха");
        ListMovieCollection listMovieCollection = new ListMovieCollection(list);

        String[] array = {"Человек-паук", "Человек-паук 2", "Человек-паук 3"};
        ArrayMovieCollection arrayMovieCollection = new ArrayMovieCollection(array);

        Iterator<String> listIterator = listMovieCollection.createListMovie();
        System.out.println("Фильмы про Дедпула: ");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        Iterator<String> arrayIterator = arrayMovieCollection.createArrayMovie();
        System.out.println("Фильмы про Человека паука: ");
        while (arrayIterator.hasNext()) {
            System.out.println(arrayIterator.next());
        }

        //Mediator

        // Создаем посредника
        HomeMediator mediator = new HomeMediatorImpl();

        // Создаем сенсоры и передаем им посредника
        Sensor temperatureSensor = new TemperatureSensor(mediator);
        Sensor humiditySensor = new HumiditySensor(mediator);
        Sensor lightSensor = new LightSensor(mediator);

        temperatureSensor.sendData();
        humiditySensor.sendData();
        lightSensor.sendData();

        // Выводим отчет с собранными данными
        mediator.printReport();


        //Memento

        TextEditor editor = new TextEditor("Первый тест");
        Caretaker caretaker = new Caretaker();

        // Сохраняем
        caretaker.addMemento(editor.saveText());

        // Редактируем текст
        editor.textEdier(editor.getText(), " Второй текст");
        System.out.println("После редактирования: " + editor.getText());

        // Сохраняем
        caretaker.addMemento(editor.saveText());

        // Еще одно редактирование
        editor.textEdier(editor.getText(), " Третьи текст");
        System.out.println("После редактирования 2: " + editor.getText());

        // Восстанавливаем первое состояние
        editor.restoreState(caretaker.getMemento(0));
        System.out.println("Востоновления номер 1: " + editor.getText());

        // Восстанавливаем второе состояние
        editor.restoreState(caretaker.getMemento(1));
        System.out.println("Востоновления номер 2: " + editor.getText());


    }

}