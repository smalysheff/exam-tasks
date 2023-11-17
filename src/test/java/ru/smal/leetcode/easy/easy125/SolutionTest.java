package ru.smal.leetcode.easy.easy125;

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
    void isPalindrome() {
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindrome(" "));
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    void isPalindromeTwoPointer() {
        assertTrue(solution.isPalindromeTwoPointer("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindromeTwoPointer(" "));
        assertFalse(solution.isPalindromeTwoPointer("race a car"));
    }

    @Test
    void isPalindromeStreamApi() {
        assertTrue(solution.isPalindromeStreamApi("A man, a plan, a canal: Panama"));
        assertTrue(solution.isPalindromeStreamApi(" "));
        assertFalse(solution.isPalindromeStreamApi("race a car"));
    }
}