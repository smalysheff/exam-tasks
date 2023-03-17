package ru.smal.gof_patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SingletonLazyTest {

    @Test
    void getInstanceTest() {
        SingletonLazy singletonLazy = SingletonLazy.getInstance();
        SingletonLazy singletonLazy1 = SingletonLazy.getInstance();

        assertSame(singletonLazy, singletonLazy1);
    }
}