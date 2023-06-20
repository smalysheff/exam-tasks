package ru.smal.common.core.interfaces.my_functional_interface;

@FunctionalInterface
public interface MyPredicate<T> {

    boolean test(T t);
}
