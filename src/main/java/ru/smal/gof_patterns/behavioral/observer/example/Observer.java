package ru.smal.gof_patterns.behavioral.observer.example;

public interface Observer<T> {

    void update(T t);
}
