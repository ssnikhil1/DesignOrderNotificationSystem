package com.dev.notification.sender;

import com.dev.order.model.OrderEvent;

public class SmsSender implements NotificationSender{
    @Override
    public void send(OrderEvent order, String message) {
        System.out.println("Sending SMS to" + order.getPhoneNumber() + ": " + message);
    }
}
