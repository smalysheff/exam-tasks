package ru.smal.gof_patterns.behavioral.observer.impl_one;

public interface Observer<T> {

    void observe(T event);
}
