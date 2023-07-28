package ru.smal.gof_patterns.behavioral.observer.gof;

/**
 * Concrete subscriber B
 */
public class ConcreteObserverB implements Observer {
    @Override
    public void update(Object o) {
        System.out.println("ConcreteObserverB" + o);
    }
}
