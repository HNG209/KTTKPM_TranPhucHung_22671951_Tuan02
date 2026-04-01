package org.example.decorator;

public class ConsumptionDecorator extends TaxDecorator {
    public ConsumptionDecorator(Product product) {
        super(product);
    }
    @Override
    public double getPrice() {
        return product.getPrice() * 1.05;
    }
}
