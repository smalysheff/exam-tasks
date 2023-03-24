package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution11Test {

    private Solution11 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution11();
    }

    @Test
    void palindromeUseStringBuilderTest() {
        assertTrue(solution.isPalindromeUseStringBuilder("maam"));
        assertTrue(solution.isPalindromeUseStringBuilder("maam! "));
        assertTrue(solution.isPalindromeUseStringBuilder("maam..."));
        assertFalse(solution.isPalindromeUseStringBuilder("palindrome"));
    }

    @Test
    void isPalindromeUseWhileLoopTest() {
        assertTrue(solution.isPalindromeUseWhileLoop("maam"));
        assertTrue(solution.isPalindromeUseWhileLoop("2002"));
        assertTrue(solution.isPalindromeUseWhileLoop("!1001!"));
        assertFalse(solution.isPalindromeUseWhileLoop("java"));
    }

    @Test
    void isPalindromeUseStreamTest() {
        assertTrue(solution.isPalindromeUseStream("maam"));
        assertTrue(solution.isPalindromeUseStream("2002"));
        assertTrue(solution.isPalindromeUseStream("!1001!"));
        assertFalse(solution.isPalindromeUseStream("java"));
    }
}