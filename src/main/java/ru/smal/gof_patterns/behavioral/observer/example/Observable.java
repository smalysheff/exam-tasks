package ru.smal.gof_patterns.behavioral.observer.example;

public interface Observable<T> {

    void subscribe(Observer<T> observer);
    void unsubscribe(Observer<T> observer);
    void notifyObservers();
}
