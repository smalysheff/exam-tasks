package ru.smal.common.custom_collection.custom_stack;

public interface Stack<T> {

    void push(T item);

    T pop();

    boolean isEmpty();
}
