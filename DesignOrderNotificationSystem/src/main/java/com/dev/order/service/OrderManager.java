package com.dev.order.service;

import com.dev.order.model.OrderEvent;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    private List<OrderEventListener> listeners = new ArrayList<>();

    public void addListener(OrderEventListener listener) {
        listeners.add(listener);
    }

    public void removeListener(OrderEventListener listener) {
        listeners.remove(listener);
    }

    public void placeOrder(OrderEvent event) {
        System.out.println("Placing order: " + event.getOrderId());
        for(OrderEventListener listener: listeners) {
            listener.onOrderPlaced(event);
        }
    }

}
