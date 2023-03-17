package ru.smal.gof_patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnumSingletonTest {

    @Test
    void initialEnumSingletonTest() {
        EnumSingleton singleton = EnumSingleton.INSTANCE;
        EnumSingleton singleton1 = EnumSingleton.INSTANCE;

        assertSame(singleton, singleton1);
    }
}