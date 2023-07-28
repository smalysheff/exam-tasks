package ru.smal.gof_patterns.behavioral.observer.gof;

import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * Concrete publisher
 */
public class ConcreteSubject implements Subject {

    private final Set<Observer> observers;
    private String message;

    public ConcreteSubject(String message) {
        this.message = message;
        observers = new CopyOnWriteArraySet<>();
    }

    public void updateMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer observer) {
        if (Objects.isNull(observer)) {
            throw new RuntimeException("null observer");
        }
        boolean notExists = observers.add(observer);
        if (!notExists) {
            throw new RuntimeException("Observer already registered.");
        }
    }

    @Override
    public void unsubscribe(Observer observer) {
        if (Objects.isNull(observer)) {
            throw new RuntimeException("null observer");
        }
        boolean contains = observers.remove(observer);
        if (!contains) {
            throw new RuntimeException("Observer not registered.");
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }
}
