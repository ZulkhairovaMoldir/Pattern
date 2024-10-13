package Assignment3.Chain;

public class PaymentA extends PaymentHandler{
    @Override
    public boolean handle(int price) {
        if (price > 100) {
            System.out.println("Недостаточна средств в карточке A");
            return next.handle(price);
        }
        System.out.println("Оплата по карточке A прошла успешна");
        if (price >= 100) {
            return true;
        }
        return true;
    }
}
