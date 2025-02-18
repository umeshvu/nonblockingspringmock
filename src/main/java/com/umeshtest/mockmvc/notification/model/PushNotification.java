package com.umeshtest.mockmvc.notification.model;

public class PushNotification {
    String deviceId;
    String message;

    public PushNotification(String deviceId, String message) {
        this.deviceId = deviceId;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Push Notification to Device ID: " + deviceId + " | Message: " + message;
    }
}
