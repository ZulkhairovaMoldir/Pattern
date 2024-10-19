package Assignment4.Strategy;

// Изменение калкулятора полной цены под способ оплаты

public class WalletPaymentStrategy implements PaymentStrategy{
    @Override
    public double calculate(double price) {
        return price;
    }
}
