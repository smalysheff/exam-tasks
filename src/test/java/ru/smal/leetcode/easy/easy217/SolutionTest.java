package ru.smal.leetcode.easy.easy217;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.easy.easy217.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void containsDuplicateTrue() {
        assertTrue(solution.containsDuplicate(new int[] {1, 1, 2, 3}));
        assertTrue(solution.containsDuplicate(new int[] {1, 2, 3, 1}));
        assertTrue(solution.containsDuplicate(new int[] {1, 2, 2, 4}));
        assertTrue(solution.containsDuplicate(new int[] {1, 2, 3, 4, 4}));
    }

    @Test
    void containsDuplicateFalse() {
        assertFalse(solution.containsDuplicate(new int[] {1, 2, 3, 4}));
        assertFalse(solution.containsDuplicate(new int[] {5, 23, 4}));
    }
}