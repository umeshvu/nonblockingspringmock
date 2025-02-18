package com.umeshtest.mockmvc.notification.service;

import com.umeshtest.mockmvc.notification.AbstractNotification;
import com.umeshtest.mockmvc.notification.model.SMSNotification;
import org.springframework.stereotype.Service;

@Service
public class SMSNotificationService extends AbstractNotification<SMSNotification> {
    @Override
    public void sendNotification(SMSNotification notification) {
        System.out.println("Sending SMS: " + notification);
    }
}
