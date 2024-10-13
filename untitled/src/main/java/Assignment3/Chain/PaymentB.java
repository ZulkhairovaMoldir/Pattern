package Assignment3.Chain;

public class PaymentB extends PaymentHandler{
    @Override
    public boolean handle(int price) {
        if (price > 300) {
            System.out.println("Недостаточна средств в карточке B");
            return next.handle(price);
        }
        System.out.println("Оплата по карточке B прошла успешна");
        if (price >= 300) {
            return true;
        }
        return true;
    }
}
