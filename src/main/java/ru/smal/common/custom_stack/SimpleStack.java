package ru.smal.common.custom_stack;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class SimpleStack<T> implements Stack<T> {

    private final ArrayList<T> list = new ArrayList<>();

    @Override
    public void push(T item) {
        list.add(0, item);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw  new EmptyStackException();
        }
        return list.remove(0);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
