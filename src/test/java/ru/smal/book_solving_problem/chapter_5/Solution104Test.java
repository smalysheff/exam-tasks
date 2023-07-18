package ru.smal.book_solving_problem.chapter_5;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution104Test {

    private Solution104 solution;

    private int[] array;

    @BeforeEach
    void setUp() {
        solution = new Solution104();
        array = createArray();
    }

    @Test
    void maxElementV1() {
        check(solution.maxElementV1(array));
    }

    @Test
    void maxElementV2() {
        check(solution.maxElementV2(array));
    }

    @Test
    void maxElementV3() {
        check(solution.maxElementV3(array));
    }

    @Test
    void maxElementV4() {
        check(solution.maxElementV4(array));
    }

    @Test
    void maxElementV5() {
        check(solution.maxElementV5(array));
    }

    private void check(int actual) {
        int expected = 10;
        assertEquals(expected, actual);
    }

    private int[] createArray() {
        return new int[]{1, 2, 4, 3, 5, 6, 7, 8, 10};
    }
}