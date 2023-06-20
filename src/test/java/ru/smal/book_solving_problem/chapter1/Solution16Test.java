package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution16Test {

    private Solution16 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution16();
    }

    @Test
    void isSubstringTrue() {
        assertTrue(solution.isSubstring("Java hello", "Java"));
        assertTrue(solution.isSubstring("Java hello", "hello"));
    }

    @Test
    void isSubstringFalse() {
        assertFalse(solution.isSubstring("Java hello", "world"));
    }
}