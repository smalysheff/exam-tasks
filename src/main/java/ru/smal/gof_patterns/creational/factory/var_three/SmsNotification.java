package ru.smal.gof_patterns.creational.factory.var_three;

public class SmsNotification implements Notification {
    @Override
    public String send() {
        return "send sms notification";
    }
}
