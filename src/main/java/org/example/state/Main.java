package org.example.state;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());

        order.next();
        System.out.println(order.getStatus());

        order.cancel();
    }
}
