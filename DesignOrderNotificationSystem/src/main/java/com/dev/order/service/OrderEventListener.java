package com.dev.order.service;

import com.dev.order.model.OrderEvent;

public interface OrderEventListener {
    void onOrderPlaced(OrderEvent order);
}
