package ru.smal.leetcode.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution167Test {

    private Solution167 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution167();
    }

    @Test
    void twoSum() {
        assertArrayEquals(new int[]{0, 1}, solution.twoSum(new int[]{2, 7, 11, 15}, 9));
        assertArrayEquals(new int[]{0, 3}, solution.twoSum(new int[]{2, 7, 11, 15}, 17));
        assertArrayEquals(new int[]{1, 2}, solution.twoSum(new int[]{2, 7, 11, 15}, 18));
    }
}