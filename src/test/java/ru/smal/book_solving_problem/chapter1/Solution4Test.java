package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution4Test {

    private Solution4 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution4();
    }

    @Test
    void isDigitTest() {
        assertTrue(solution.isDigitUsePattern("1111"));

        assertFalse(solution.isDigitUsePattern(" 1111"));
        assertFalse(solution.isDigitUsePattern("a1"));
        assertFalse(solution.isDigitUsePattern("1a"));
        assertFalse(solution.isDigitUsePattern(" "));
        assertFalse(solution.isDigitUsePattern(""));
    }

    @Test
    void isDigitForLoopTest() {
        assertTrue(solution.isDigitUseForLoop("1111"));

        assertFalse(solution.isDigitUseForLoop(" 1111"));
        assertFalse(solution.isDigitUseForLoop("a1"));
        assertFalse(solution.isDigitUseForLoop("1a"));
        assertFalse(solution.isDigitUseForLoop(" "));
        assertFalse(solution.isDigitUseForLoop(""));
    }

    @Test
    void isDigitUseTryCatchTest() {
        assertTrue(solution.isDigitUseTryCatch("1111"));

        assertFalse(solution.isDigitUseTryCatch(" 1111"));
        assertFalse(solution.isDigitUseTryCatch("a1"));
        assertFalse(solution.isDigitUseTryCatch("1a"));
        assertFalse(solution.isDigitUseTryCatch(" "));
        assertFalse(solution.isDigitUseTryCatch(""));
    }

    @Test
    void isDigitUseStreamTest() {
        assertTrue(solution.isDigitUseStream("1111"));

        assertFalse(solution.isDigitUseStream(" 1111"));
        assertFalse(solution.isDigitUseStream("a1"));
        assertFalse(solution.isDigitUseStream("1a"));
        assertFalse(solution.isDigitUseStream(" "));
        assertFalse(solution.isDigitUseStream(""));
    }
}