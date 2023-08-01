package ru.smal.gof_patterns.behavioral.observer.example;

import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public class KeyButtonObservable implements Observable<String> {

    private final Set<Observer<String>> observers;
    private String message;

    public KeyButtonObservable() {
        this.observers = new CopyOnWriteArraySet<>();
    }

    public KeyButtonObservable(String message) {
        this.observers = new CopyOnWriteArraySet<>();
        this.message = message;
    }

    public void updateMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    @Override
    public void subscribe(Observer<String> observer) {
        observers.add(observer);
    }

    @Override
    public void unsubscribe(Observer<String> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(message));
    }
}
