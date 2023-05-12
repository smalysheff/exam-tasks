package ru.smal.common.core.stream_api.task;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class Solution1Test {

    private Solution1 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution1();
    }

    @Test
    void evenTest() {
        Assertions.assertThat(solution.even(buildNums())).isEqualTo(5);
    }

    @Test
    void oddTest() {
        Assertions.assertThat(solution.odd(buildNums())).isEqualTo(5);
    }

    @Test
    void evenUsingForLoopTest() {
        Assertions.assertThat(solution.evenUsingForLoop(buildNums())).isEqualTo(5);
    }

    @Test
    void oddUsingForLoopTestTest() {
        Assertions.assertThat(solution.oddUsingForLoop(buildNums())).isEqualTo(5);
    }

    @Test
    void evenUpperBoundRangeTest() {
        Assertions.assertThat(solution.even(10)).isEqualTo(5);
    }

    @Test
    void evenUpperBoundRangeIterateLimitTest() {
        Assertions.assertThat(solution.evenIterateLimit(10)).isEqualTo(5);
    }

    @Test
    void oddUpperBoundRangeTest() {
        Assertions.assertThat(solution.odd(10)).isEqualTo(5);
    }

    private static int[] buildNums() {
        return IntStream
                .iterate(0, i -> i + 1)
                .limit(10)
                .toArray();

    }
}