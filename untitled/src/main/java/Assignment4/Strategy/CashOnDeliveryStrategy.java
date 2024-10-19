package Assignment4.Strategy;

// Изменение калкулятора полной цены под способ оплаты

public class CashOnDeliveryStrategy implements PaymentStrategy{
    private static final double delivary = 300;

    @Override
    public double calculate(double price) {
        return price + delivary;
    }
}
