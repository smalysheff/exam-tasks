package ru.smal.gof_patterns.creational.factory.var_one;

public class EmailNotificationFactory implements NotificationFactory {
    @Override
    public Notification create() {
        return new EmailNotification();
    }
}
