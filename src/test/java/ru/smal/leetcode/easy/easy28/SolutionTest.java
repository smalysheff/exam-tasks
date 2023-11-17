package ru.smal.leetcode.easy.easy28;

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
    void containsStr() {
        assertEquals(0, solution.containsStr("sadbutsad", "sad"));
        assertEquals(-1, solution.containsStr("leetcode", "leeto"));
        assertEquals(2, solution.containsStr("hello", "ll"));
    }

    @Test
    void containsStrV2() {
        assertEquals(0, solution.containsStrV2("sadbutsad", "sad"));
        assertEquals(-1, solution.containsStrV2("leetcode", "leeto"));
        assertEquals(2, solution.containsStrV2("hello", "ll"));
        assertEquals(0, solution.containsStrV2("a", "a"));
    }
}