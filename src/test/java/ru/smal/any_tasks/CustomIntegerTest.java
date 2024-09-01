package ru.smal.any_tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CustomIntegerTest {

    CustomInteger customInteger;

    @BeforeEach
    public void setup() {
        customInteger = CustomInteger.newInstance();
    }

    @Test
    void parse_Success() {
        String str = "123";
        customInteger.parseInt(str);
        assertEquals(123, customInteger.getValue());
    }

    @Test
    void parse1_Success() {
        customInteger.parseInt1("123");
        assertEquals(123, customInteger.getValue());
    }

    @Test
    void parse1_Negative_Success() {
        customInteger.parseInt1("-123");
        assertEquals(-123, customInteger.getValue());
    }
}
