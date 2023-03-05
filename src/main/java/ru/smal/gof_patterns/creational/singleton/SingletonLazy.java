package ru.smal.gof_patterns.creational.singleton;

public final class SingletonLazy {

    private static SingletonLazy INSTANCE;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
