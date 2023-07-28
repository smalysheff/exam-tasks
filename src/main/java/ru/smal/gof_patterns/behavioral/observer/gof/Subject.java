package ru.smal.gof_patterns.behavioral.observer.gof;

/**
 * Publisher
 */
public interface Subject {

    void subscribe(Observer observer);
    void unsubscribe(Observer observer);
    void notifyObservers();
}
