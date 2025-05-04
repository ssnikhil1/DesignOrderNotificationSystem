package com.dev.notification.service;

import com.dev.notification.factory.NotificationSenderFactory;
import com.dev.notification.sender.NotificationSender;
import com.dev.order.model.Channel;
import com.dev.order.model.OrderEvent;
import com.dev.order.service.OrderEventListener;


public class NotificationService implements OrderEventListener {
    @Override
    public void onOrderPlaced(OrderEvent event) {
        Channel channel = event.getPreferredChannel();
        NotificationSender sender = NotificationSenderFactory.getSender(channel);

        sender.send(event, "ORDER_CREATED");

    }
}
