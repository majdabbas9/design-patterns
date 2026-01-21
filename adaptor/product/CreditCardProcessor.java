package adaptor.product;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("Paid $" + amount + " using Credit Card");
    }
}