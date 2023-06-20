package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution21Test {

    private Solution21 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution21();
    }

    @Test
    void trimNormalizeNullArg() {
        assertNull(solution.trimNormalize(null));
    }

    @Test
    void trimNormalize() {
        assertEquals("Hello", solution.trimNormalize(" Hello\n\t"));
    }

    @Test
    void trimNormalizeV2() {
        assertEquals("Hello", solution.trimNormalizeV2(" Hello\n\t"));
        assertNotEquals("Hello", solution.trimNormalizeV2(" Hello\n\t" + '\u2002'));
    }

    @Test
    void trimNormalizeV3() {
        assertEquals("Hello", solution.trimNormalizeV3(" Hello\n\t"));
        assertEquals("Hello", solution.trimNormalizeV3(" Hello\n\t" + '\u2002'));
    }
}