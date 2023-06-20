package ru.smal.common.core.interfaces.my_functional_interface;

@FunctionalInterface
public interface MySupplier<T> {

    T get();
}
