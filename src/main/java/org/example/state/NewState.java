package org.example.state;

public class NewState implements OrderState{
    @Override
    public void next(Order order) {
        order.setState(new ProcessingState());
    }
    @Override
    public void cancel(Order order) {
        order.setState(new CancelledState());
    }

    @Override
    public String getStatus() {
        return "NEW STATE";
    }
}
