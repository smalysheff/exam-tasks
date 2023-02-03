package ru.smal.gof_patterns.creational.factory.var_two;

public abstract class NotificationFactory {

    public Notification createNotificationAndSend() {
        Notification notification = createNotification();
        notification.send();
        return notification;
    }

    public abstract Notification createNotification();
}
