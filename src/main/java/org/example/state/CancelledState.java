package org.example.state;

public class CancelledState implements OrderState {
    @Override
    public void next(Order order) {
        System.out.println("Order is cancelled");
    }
    @Override
    public void cancel(Order order) {
        System.out.println("Order cancelled");
    }
    @Override
    public String getStatus() {
        return "CANCELLED";
    }
}
