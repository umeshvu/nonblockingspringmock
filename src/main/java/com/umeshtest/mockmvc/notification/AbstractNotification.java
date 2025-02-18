package com.umeshtest.mockmvc.notification;

public abstract class AbstractNotification<T> implements NotificationService<T> {
    @Override
    public void scheduleNotification(T notification, String time) {
        System.out.println("Notification scheduled at: " + time);
    }
}

