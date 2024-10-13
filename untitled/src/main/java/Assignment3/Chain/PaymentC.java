package Assignment3.Chain;

public class PaymentC extends PaymentHandler{
    @Override
    public boolean handle(int price) {
        if (price > 1000) {
            System.out.println("Недостаточна средств в карточке C");
            return next.handle(price);
        }
        System.out.println("Оплата по карточке C прошла успешна");
        if (price >= 1000) {
            return true;
        }
        return true;
    }
}
