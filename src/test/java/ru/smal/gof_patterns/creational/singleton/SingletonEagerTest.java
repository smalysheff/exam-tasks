package ru.smal.gof_patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertSame;

class SingletonEagerTest {

    @Test
    void getInstanceTest() {
        SingletonEager singleton1 = SingletonEager.getInstance();
        SingletonEager singleton = SingletonEager.getInstance();

        assertSame(singleton, singleton1);
    }

}