package ru.smal.multitreading.singleton;

public class SingletonHolder {

    public int x = 1000;

    private SingletonHolder() {
    }

    public static SingletonHolder getInstance() {
        return InstanceHolder.INSTANCE;
    }

    private static final class InstanceHolder {
        private static final SingletonHolder INSTANCE = new SingletonHolder();
    }
}
