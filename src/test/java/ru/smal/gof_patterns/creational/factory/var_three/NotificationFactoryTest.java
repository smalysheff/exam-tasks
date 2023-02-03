package ru.smal.gof_patterns.creational.factory.var_three;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationFactoryTest {

    private NotificationFactory factory;

    @BeforeEach
    void setUp() {
        factory = new NotificationFactory();
    }

    @AfterEach
    void after() {
        factory = null;
    }

    @Test
    void smsNotificationSuccessTest() {
        Notification notification = factory.create("sms");

        assertNotNull(notification);
        assertEquals("send sms notification", notification.send());
    }

    @Test
    void emailNotificationSuccessTest() {
        Notification notification = factory.create("email");

        assertNotNull(notification);
        assertEquals("send email notification", notification.send());
    }

    @Test
    void notificationFailTest() {
        IllegalArgumentException exception =
                assertThrows(IllegalArgumentException.class, () -> factory.create("wrong type"));

        assertEquals("Notification type: wrong type not found", exception.getMessage());
    }
}