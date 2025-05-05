package com.dev.notification.factory;

import com.dev.notification.proxy.RetryNotificationSenderproxy;
import com.dev.notification.sender.EmailSender;
import com.dev.notification.sender.NotificationSender;
import com.dev.notification.sender.SmsSender;
import com.dev.order.model.Channel;


public class NotificationSenderFactory {
    public static NotificationSender getSender(Channel channel) {
        NotificationSender baseSender;
        switch (channel) {
            case EMAIL:
                baseSender =  new EmailSender();
                break;
            case SMS:
                baseSender =  new SmsSender();
                break;
            default:
                throw new IllegalArgumentException("Unsupported channel: " + channel);
        }
        return new RetryNotificationSenderproxy(baseSender, 3, 1000);
    }
}
