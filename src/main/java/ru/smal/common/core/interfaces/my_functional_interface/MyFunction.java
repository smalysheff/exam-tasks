package ru.smal.common.core.interfaces.my_functional_interface;

@FunctionalInterface
public interface MyFunction<T, R> {

    R apply(T t);
}
