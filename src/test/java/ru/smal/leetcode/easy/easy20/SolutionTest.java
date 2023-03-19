package ru.smal.easy.easy20;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void isValidTrue() {
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("([])"));
        assertTrue(solution.isValid("<({[]<>})<>{}>"));
    }

    @Test
    void isValidFalse() {
        assertFalse(solution.isValid("("));
        assertFalse(solution.isValid(")"));
        assertFalse(solution.isValid("()["));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("(])]"));
    }
}