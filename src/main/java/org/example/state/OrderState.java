package org.example.state;

public interface OrderState {
    void next(Order order);
    void cancel(Order order);
    String getStatus();
}
