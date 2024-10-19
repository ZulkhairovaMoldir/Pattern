package Assignment4.Strategy;

// Изменение калкулятора полной цены под способ оплаты
public class CardPaymentStrategy implements PaymentStrategy{
    private static final double rate = 0.02;

    @Override
    public double calculate(double price) {
        return price + (price * rate);
    }
}
