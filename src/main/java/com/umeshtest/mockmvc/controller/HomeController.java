package com.umeshtest.mockmvc.controller;

import com.umeshtest.mockmvc.notification.NotificationService;
import com.umeshtest.mockmvc.notification.model.EmailNotification;
import com.umeshtest.mockmvc.notification.model.PushNotification;
import com.umeshtest.mockmvc.notification.model.SMSNotification;
import com.umeshtest.mockmvc.notification.service.EmailNotificationService;
import com.umeshtest.mockmvc.notification.service.PushNotificationService;
import com.umeshtest.mockmvc.notification.service.SMSNotificationService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HomeController {

    @GetMapping("/home")
    Map<String,String> home(){
        NotificationService<EmailNotification> emailService = new EmailNotificationService();
        EmailNotification email = new EmailNotification("john@example.com", "Welcome!", "Hello John, welcome to our platform.");
        emailService.sendNotification(email);
        emailService.scheduleNotification(email, "10:00 AM");

        NotificationService<SMSNotification> smsService = new SMSNotificationService();
        SMSNotification sms = new SMSNotification("+1234567890", "Your OTP is 1234.");
        smsService.sendNotification(sms);
        smsService.scheduleNotification(sms, "10:30 AM");

        NotificationService<PushNotification> pushService = new PushNotificationService();
        PushNotification push = new PushNotification("device_ABC123", "New Offer: 50% Off!");
        pushService.sendNotification(push);
        pushService.scheduleNotification(push, "11:00 AM");


        return Map.of("a","b");
    }
}
