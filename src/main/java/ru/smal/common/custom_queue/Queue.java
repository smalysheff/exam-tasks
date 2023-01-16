package ru.smal.common.custom_queue;

public interface Queue<T> {

    void add(T item);

    T remove();

    boolean isEmpty();
}
