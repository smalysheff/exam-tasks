package ru.smal.gof_patterns.creational.factory.var_two;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NotificationFactoryTest {

    private NotificationFactory notificationFactory;

    @AfterEach
    void afterAll() {
        notificationFactory = null;
    }

    @Test
    void smsNotificationTest() {
        notificationFactory = new SmsNotificationFactory();
        Notification notification = notificationFactory.createNotification();

        assertEquals("send sms notification", notification.send());
    }

    @Test
    void emailNotificationTest() {
        notificationFactory = new EmailNotificationFactory();
        Notification notification = notificationFactory.createNotification();

        assertEquals("send email notification", notification.send());
    }
}