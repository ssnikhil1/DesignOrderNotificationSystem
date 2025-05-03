package com.dev.order.model;

public class OrderEvent {
    private String orderId;
    private String userEmail;
    private String preferredChannel;  // email or sms

    public OrderEvent(String orderId, String userEmail, String preferredChannel) {
        this.orderId = orderId;
        this.userEmail = userEmail;
        this.preferredChannel = preferredChannel;
    }

    public String getOrderId() {
        return  orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public  String getPreferredChannel() {
        return preferredChannel;
    }

    public void setPreferredChannel(String preferredChannel) {
        this.preferredChannel = preferredChannel;
    }
}
