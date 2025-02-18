package com.umeshtest.mockmvc.notification.service;

import com.umeshtest.mockmvc.notification.AbstractNotification;
import com.umeshtest.mockmvc.notification.model.PushNotification;
import org.springframework.stereotype.Service;

@Service
public class PushNotificationService extends AbstractNotification<PushNotification> {
    @Override
    public void sendNotification(PushNotification notification) {
        System.out.println("Sending Push Notification: " + notification);
    }
}
