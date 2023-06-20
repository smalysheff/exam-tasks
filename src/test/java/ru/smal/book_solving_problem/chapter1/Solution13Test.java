package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution13Test {

    public static final String TEST = "test";

    private Solution13 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution13();
    }

    @Test
    void removeSymbol1() {
        String actual = solution.removeSymbol1(TEST, 't');

        assertEquals("es", actual);
    }

    @Test
    void removeSymbol2() {
        String actual = solution.removeSymbol2(TEST, 't');

        assertEquals("es", actual);
    }

    @Test
    void removeSymbol3() {
        String actual = solution.removeSymbol3(TEST, 't');

        assertEquals("es", actual);
    }

    @Test
    void removeSymbol4() {
        String actual = solution.removeSymbol4(TEST, 't');

        assertEquals("es", actual);
    }
}