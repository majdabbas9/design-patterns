package adaptor;

import adaptor.product.PaymentProcessor;
import adaptor.third_party.PayPalSDK;

public class Test {
    public static void main(String[] args) {
        PaymentProcessor paypal = new PayPalAdapter(new PayPalSDK());
        paypal.pay(26.0);
    }
}
