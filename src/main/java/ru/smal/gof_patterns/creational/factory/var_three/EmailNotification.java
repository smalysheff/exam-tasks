package ru.smal.gof_patterns.creational.factory.var_three;

public class EmailNotification implements Notification {
    @Override
    public String send() {
        return "send email notification";
    }
}
