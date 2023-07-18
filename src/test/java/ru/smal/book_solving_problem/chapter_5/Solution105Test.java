package ru.smal.book_solving_problem.chapter_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Solution105Test {

    private Solution105 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution105();
    }

    @Test
    void reverseV1() {
        assertArrayEquals(new int[]{3, 2, 1, 10}, solution.reverseV1(new int[]{10, 1, 2, 3}));
    }

    @Test
    void reverseV2() {
        assertArrayEquals(new int[]{3, 2, 1, 10}, solution.reverseV2(new int[]{10, 1, 2, 3}));
    }
}