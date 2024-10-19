package Assignment4.Strategy;

// Интерфейс определяющий методы для способов оплаты

public interface PaymentStrategy {
    double calculate(double price);
}
