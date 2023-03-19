package ru.smal.leetcode.easy.easy268;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.easy.easy268.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void missingNumberXor() {
        assertEquals(2, solution.missingNumberXor(new int[] {3, 0, 1}));
        assertEquals(2, solution.missingNumberXor(new int[] {0, 1}));
        assertEquals(8, solution.missingNumberXor(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    @Test
    void missingNumber() {
        assertEquals(2, solution.missingNumber(new int[] {3, 0, 1}));
        assertEquals(2, solution.missingNumber(new int[] {0, 1}));
        assertEquals(8, solution.missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }
}