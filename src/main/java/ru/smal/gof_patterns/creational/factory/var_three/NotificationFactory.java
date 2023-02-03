package ru.smal.gof_patterns.creational.factory.var_three;

import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

import static java.util.Map.entry;

public class NotificationFactory {

    private static final Map<String, Supplier<Notification>> FACTORY_MAP = Map.ofEntries(
            entry("sms", SmsNotification::new),
            entry("email", EmailNotification::new)
    );

    public Notification create(String type) {
        Supplier<Notification> factory = FACTORY_MAP.get(type);
        if (Objects.isNull(factory)) {
            throw new IllegalArgumentException(String.format("Notification type: %s not found", type));
        }

        return factory.get();
    }
}
