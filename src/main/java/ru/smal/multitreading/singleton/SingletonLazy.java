package ru.smal.multitreading.singleton;

/**
 * Thread safe Singleton implements double-checking
 */
public class SingletonLazy {

    private static volatile SingletonLazy INSTANCE;

    public int x = 1000;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }
}
