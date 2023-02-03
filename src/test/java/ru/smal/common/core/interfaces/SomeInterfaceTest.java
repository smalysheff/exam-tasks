package ru.smal.common.core.interfaces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SomeInterfaceTest {

    @Test
    void defaultMethod() {
        SomeInterface someInterface = new SomeInterface() {};

        // Method belongs to the object
        String result = someInterface.defaultMethod();
        assertEquals("default method", result);
    }

    @Test
    void overrideDefaultMethod() {
        SomeInterface someInterface = new SomeInterfaceImpl();

        // Method belongs to the object
        String result = someInterface.defaultMethod();
        assertEquals("override default method", result);
    }

    @Test
    void staticMethod() {
        // Method belongs to the class
        String result = SomeInterface.staticMethod();
        assertEquals("static method", result);
    }

    // Data preparation
    class SomeInterfaceImpl implements SomeInterface {

        @Override
        public String defaultMethod() {
            return "override " + SomeInterface.super.defaultMethod();
        }
    }
}
