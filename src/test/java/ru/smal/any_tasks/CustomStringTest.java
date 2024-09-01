package ru.smal.any_tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomStringTest {

    CustomString customString;

    @BeforeEach
    void setUp() {
        customString = CustomString.of("Hello");
    }

    @Test
    void replace() {
        customString.replace('l', 'o');
        assertEquals("Heooo", customString.toString());
    }
}