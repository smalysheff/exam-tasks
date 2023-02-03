package ru.smal.gof_patterns.creational.factory.var_one;

public class SmsNotificationFactory implements NotificationFactory {
    @Override
    public Notification create() {
        return new SmsNotification();
    }
}
