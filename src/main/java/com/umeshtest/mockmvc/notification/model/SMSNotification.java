package com.umeshtest.mockmvc.notification.model;

public class SMSNotification {
    String phoneNumber;
    String message;

    public SMSNotification(String phoneNumber, String message) {
        this.phoneNumber = phoneNumber;
        this.message = message;
    }

    @Override
    public String toString() {
        return "SMS to: " + phoneNumber + " | Message: " + message;
    }
}
