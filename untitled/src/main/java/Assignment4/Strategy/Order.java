package Assignment4.Strategy;

// Управления заказами

public class Order {
    private double price;
    private PaymentStrategy paymentStrategy;

    public Order(double price) {
        this.price = price;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public double calculateFinalPrice() {
        return paymentStrategy.calculate(price);
    }
}
