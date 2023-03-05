package ru.smal.gof_patterns.creational.singleton;

public final class SingletonEager {

    private static final SingletonEager INSTANCE = new SingletonEager();

    private SingletonEager() {
    }

    public static SingletonEager getInstance() {
        return INSTANCE;
    }
}
