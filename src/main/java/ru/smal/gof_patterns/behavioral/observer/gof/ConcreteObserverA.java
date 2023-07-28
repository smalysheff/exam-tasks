package ru.smal.gof_patterns.behavioral.observer.gof;

/**
 * Concrete subscriber A
 */
public class ConcreteObserverA implements Observer {

    @Override
    public void update(Object o) {
        System.out.println("ConcreteObserverA" + o);
    }
}
