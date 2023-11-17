package ru.smal.any_tasks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseNumberTest {

    private ReverseNumber reverseNumber;

    @BeforeEach
    void setUp() {
        reverseNumber = new ReverseNumber();
    }

    @Test
    void applyUseStringBuilder() {
        assertEquals(321, reverseNumber.applyUseStringBuilder(123));
        assertEquals(123, reverseNumber.applyUseStringBuilder(321));
        assertEquals(123, reverseNumber.applyUseStringBuilder(3210));
        assertEquals(4, reverseNumber.applyUseStringBuilder(400));
    }

    @Test
    void apply() {
        assertEquals(321, reverseNumber.apply(123));
        assertEquals(123, reverseNumber.apply(321));
        assertEquals(123, reverseNumber.apply(3210));
        assertEquals(4, reverseNumber.apply(400));
        assertEquals(-78, reverseNumber.apply(-870));
        assertEquals(-178, reverseNumber.apply(-8710));
    }
}