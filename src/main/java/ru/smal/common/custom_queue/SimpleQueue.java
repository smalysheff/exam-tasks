package ru.smal.common.custom_queue;

import java.util.ArrayList;

public class SimpleQueue<T> implements Queue<T> {

    private static final int FIRST_ITEM = 0;

    private final ArrayList<T> list = new ArrayList<>();

    @Override
    public void add(T item) {
        list.add(item);
    }

    @Override
    public T remove() {
        return list.remove(FIRST_ITEM);
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }
}
