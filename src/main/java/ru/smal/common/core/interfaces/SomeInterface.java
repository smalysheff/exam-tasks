package ru.smal.common.core.interfaces;

public interface SomeInterface {

    default String defaultMethod() {
        return "default method";
    }

    static String staticMethod() {
        return "static method";
    }
}
