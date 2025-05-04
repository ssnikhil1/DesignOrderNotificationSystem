package com.dev.notification.sender;

import com.dev.order.model.OrderEvent;

public class EmailSender implements NotificationSender {
    @Override
    public void send(OrderEvent order, String message) {
        System.out.println("Sending EMAIL to" + order.getUserEmail() + ": " + message);
    }
}
