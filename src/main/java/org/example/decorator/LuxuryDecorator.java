package org.example.decorator;

public class LuxuryDecorator extends TaxDecorator {
    public LuxuryDecorator(Product product) {
        super(product);
    }
    @Override
    public double getPrice() {
        return product.getPrice() * 1.2;
    }
}
