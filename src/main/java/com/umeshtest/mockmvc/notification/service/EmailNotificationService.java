package com.umeshtest.mockmvc.notification.service;

import com.umeshtest.mockmvc.notification.AbstractNotification;
import com.umeshtest.mockmvc.notification.model.EmailNotification;
import org.springframework.stereotype.Service;

@Service
public class EmailNotificationService extends AbstractNotification<EmailNotification> {

    @Override
    public void sendNotification(EmailNotification notification) {
        System.out.println("Sending Email: " + notification);
    }
}
