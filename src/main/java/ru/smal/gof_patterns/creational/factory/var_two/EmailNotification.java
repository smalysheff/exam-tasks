package ru.smal.gof_patterns.creational.factory.var_two;

public class EmailNotification implements Notification {
    @Override
    public String send() {
        return "send email notification";
    }
}
