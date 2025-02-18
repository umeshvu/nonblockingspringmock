package com.umeshtest.mockmvc.notification;

public interface NotificationService<T> {
    void sendNotification(T notification);
    void scheduleNotification(T notification, String time);
}
