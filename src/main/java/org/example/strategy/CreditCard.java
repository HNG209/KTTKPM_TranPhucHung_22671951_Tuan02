package org.example.strategy;

public class CreditCard implements PaymentStrategy {
    private final String cardNumber;
    public CreditCard(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(double amount) {
        System.out.println("Thanh toán " + amount + " bằng thẻ: " + cardNumber);
    }
}
