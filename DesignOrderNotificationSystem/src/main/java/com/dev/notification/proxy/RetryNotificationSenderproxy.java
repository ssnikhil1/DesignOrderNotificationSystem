package com.dev.notification.proxy;

import com.dev.notification.sender.NotificationSender;
import com.dev.order.model.OrderEvent;

public class RetryNotificationSenderproxy implements NotificationSender {

    private final int maxRetries;
    private final long delayMillis;
    private final NotificationSender wrappedSender;

    public RetryNotificationSenderproxy(NotificationSender wrappedSender, int maxRetries, long delayMillis) {
        this.maxRetries = maxRetries;
        this.delayMillis = delayMillis;
        this.wrappedSender = wrappedSender;
    }

    @Override
    public void send(OrderEvent order, String message) {
        int attempt = 0;
        while(attempt < maxRetries) {
            try {
                wrappedSender.send(order, message);
                return;
            } catch (Exception e) {
                attempt++;
                System.out.println("Retry attempt " + attempt + " failed: " + e.getMessage());
                if(attempt == maxRetries) {
                    throw e;
                }
                try {
                    System.out.println("Sleeping for 2 seconds...");
                    Thread.sleep(delayMillis);
                    System.out.println("Woke up!");
                } catch (InterruptedException error) {
                    System.err.println("Thread was interrupted during sleep.");
                    Thread.currentThread().interrupt(); // Good practice
                }
            }
        }
    }
}
