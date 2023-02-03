package ru.smal.gof_patterns.creational.factory.var_two;

public class SmsNotificationFactory extends NotificationFactory {
    @Override
    public Notification createNotification() {
        return new SmsNotification();
    }
}
