package ru.smal.gof_patterns.behavioral.observer.impl_two;

import java.util.List;

public interface Observed {

    void registerObserver(Observer observer);

    void unregisterObserver(Observer observer);

    void notifyObservers();
}
