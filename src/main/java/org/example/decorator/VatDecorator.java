package org.example.decorator;

public class VatDecorator extends TaxDecorator {
    public VatDecorator(Product product) {
        super(product);
    }
    @Override
    public double getPrice() {
        return product.getPrice() * 1.1;
    }
}
