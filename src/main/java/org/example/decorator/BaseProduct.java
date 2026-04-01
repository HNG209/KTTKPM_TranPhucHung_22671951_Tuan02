package org.example.decorator;

public class BaseProduct implements Product {
    private final double price;
    public BaseProduct(double price) {
        this.price = price;
    }
    @Override
    public double getPrice() {
        return price;
    }
}
