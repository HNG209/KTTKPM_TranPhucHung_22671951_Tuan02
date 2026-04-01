package org.example.strategy;

public class Main {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();

        paymentService.setStrategy(new CreditCard("1234-578"));
        paymentService.pay(200);

        paymentService.setStrategy(new PayPal("abc@gmail.com"));
        paymentService.pay(300);
    }
}
