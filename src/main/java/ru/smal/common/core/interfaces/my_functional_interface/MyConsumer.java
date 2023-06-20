package ru.smal.common.core.interfaces.my_functional_interface;

@FunctionalInterface
public interface MyConsumer<T> {

    void accept(T t);
}

