package org.example.state;

public class DeliveredState implements OrderState{
    @Override
    public void next(Order order) {
        System.out.println("Order delivered");
    }
    @Override
    public void cancel(Order order) {
        System.out.println("Order delivered");
    }
    @Override
    public String getStatus() {
        return "DELIVERED";
    }
}
