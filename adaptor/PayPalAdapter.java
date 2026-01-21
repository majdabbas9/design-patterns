package adaptor;

import adaptor.product.PaymentProcessor;
import adaptor.third_party.PayPalSDK;

public class PayPalAdapter implements PaymentProcessor {

    private final PayPalSDK payPalSDK;

    public PayPalAdapter(PayPalSDK payPalSDK) {
        this.payPalSDK = payPalSDK;
    }

    @Override
    public void pay(double amount) {
        int cents = (int) (amount * 1.05);
        payPalSDK.makePayment(cents);
    }
}