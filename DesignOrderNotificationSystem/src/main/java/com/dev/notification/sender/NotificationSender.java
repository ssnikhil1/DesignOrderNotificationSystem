package com.dev.notification.sender;

import com.dev.order.model.OrderEvent;

public interface NotificationSender {
    void send(OrderEvent order, String message);
}
