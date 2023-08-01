package ru.smal.gof_patterns.behavioral.observer.impl_two;

public interface Observed {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
