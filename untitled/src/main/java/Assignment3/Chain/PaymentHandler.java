package Assignment3.Chain;

public abstract class PaymentHandler {
    protected PaymentHandler next;

    public PaymentHandler setNext(PaymentHandler next) {
        this.next = next;
        return next;
    }

    public abstract boolean handle(int price);
}
