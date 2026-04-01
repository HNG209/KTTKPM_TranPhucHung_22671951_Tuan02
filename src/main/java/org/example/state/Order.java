package org.example.state;

public class Order {
    private OrderState orderState;
    public Order() {
        this.orderState = new NewState();
    }
    public void setState(OrderState orderState) {
        this.orderState = orderState;
    }
    public void next() {
        orderState.next(this);
    }
    public void cancel() {
        orderState.cancel(this);
    }
    public String getStatus() {
        return orderState.getStatus();
    }
}
