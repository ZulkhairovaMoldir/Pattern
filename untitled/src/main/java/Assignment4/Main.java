package Assignment4;

import Assignment4.Observer.*;
import Assignment4.State.Player;
import Assignment4.Strategy.CardPaymentStrategy;
import Assignment4.Strategy.CashOnDeliveryStrategy;
import Assignment4.Strategy.Order;
import Assignment4.Strategy.WalletPaymentStrategy;
import Assignment4.Template.ElectronicsQualityCheck;
import Assignment4.Template.FoodQualityCheck;
import Assignment4.Template.QualityCheck;
import Assignment4.Visitor.*;

public class Main {
    public static void main(String[] args) {
        //Observer

        NewsPublisherImpl newsPublisher = new NewsPublisherImpl();

        Observer smartphoneSubscriber = new NewsSubscriberSmartphone();
        Observer laptopSubscriber = new NewsSubscriberLaptop();
        Observer tabletSubscriber = new NewsSubscriberTablet();

        newsPublisher.subscribe(smartphoneSubscriber);
        newsPublisher.subscribe(laptopSubscriber);
        newsPublisher.subscribe(tabletSubscriber);

        newsPublisher.publishNews("Спорт", "Португалия выиграла");
        newsPublisher.publishNews("Наука", "Обнаружен новый вид насекомых");
        newsPublisher.publishNews("Новости", "Случилась ДТП");

        //State
        System.out.println();

        Player player = new Player();

        player.play();
        player.pause();
        player.play();
        player.stop();
        player.pause();

        // Strategy
        System.out.println();

        Order order = new Order(5000);
        order.setPaymentStrategy(new CardPaymentStrategy());
        System.out.println("Полная стоимастть при оплате картой: " + order.calculateFinalPrice() + " тенге");

        order.setPaymentStrategy(new WalletPaymentStrategy());
        System.out.println("Полная стоимастть при оплате кошельком: " + order.calculateFinalPrice() + " тенге");

        order.setPaymentStrategy(new CashOnDeliveryStrategy());
        System.out.println("Полная стоимастть при оплате после доставки: " + order.calculateFinalPrice() + " тенге");

        // Template
        System.out.println();

        QualityCheck foodCheck = new FoodQualityCheck();
        System.out.println("Проверка продуктов питания: ");
        foodCheck.checkProduct();

        System.out.println();

        QualityCheck electronicsCheck = new ElectronicsQualityCheck();
        System.out.println("Проверка электронных товаров: ");
        electronicsCheck.checkProduct();

        // Visitor

        System.out.println();
        File textFile1 = new TextFile("document1.txt", "чистый текст");
        File textFile2 = new TextFile("document2.txt", "запрещенное слово.");
        File executableFile1 = new ExecutableFile("program1.exe" , "вирус");
        File executableFile2 = new ExecutableFile("program2.exe" , "чистый код");

        Visitor antivirus = new AntivirusVisitor();
        Visitor report = new ReportVisitor();

        System.out.println("Антивирусная проверка:");
        textFile1.accept(antivirus);
        textFile2.accept(antivirus);
        executableFile1.accept(antivirus);
        executableFile2.accept(antivirus);

        System.out.println();

        System.out.println("Отчёт: ");
        textFile1.accept(report);
        textFile2.accept(report);
        executableFile1.accept(report);
        executableFile2.accept(report);
    }

}
