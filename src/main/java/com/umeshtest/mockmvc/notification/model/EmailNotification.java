package com.umeshtest.mockmvc.notification.model;


public class EmailNotification {
    String recipient;
    String subject;
    String message;

    public EmailNotification(String recipient, String subject, String message) {
        this.recipient = recipient;
        this.subject = subject;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Email to: " + recipient + " | Subject: " + subject + " | Message: " + message;
    }
}
