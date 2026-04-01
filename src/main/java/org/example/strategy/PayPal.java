package org.example.strategy;

public class PayPal implements PaymentStrategy {
    private final String email;
    public PayPal(String email) {
        this.email = email;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " qua PayPal: " + email);
    }
}
