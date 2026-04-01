package org.example.decorator;

public class Main {
    public static void main(String[] args) {
        Product product = new BaseProduct(100);

        product = new VatDecorator(product);
        product = new LuxuryDecorator(product);

        System.out.println(product.getPrice());
    }
}
