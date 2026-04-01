package org.example.state;

public class ProcessingState implements OrderState {
    @Override
    public void next(Order order) {
        order.setState(new DeliveredState());
    }
    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }
    @Override
    public String getStatus() {
        return "PROCESSING";
    }
}
