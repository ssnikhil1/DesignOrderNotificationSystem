package com.dev.notification.factory;

import com.dev.notification.sender.EmailSender;
import com.dev.notification.sender.NotificationSender;
import com.dev.notification.sender.SmsSender;
import com.dev.order.model.Channel;


public class NotificationSenderFactory {
    public static NotificationSender getSender(Channel channel) {
        switch (channel) {
            case EMAIL:
                return new EmailSender();
            case SMS:
                return new SmsSender();
            default:
                throw new IllegalArgumentException("Unsupported channel: " + channel);
        }
    }
}
