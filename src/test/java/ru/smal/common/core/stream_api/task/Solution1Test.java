package ru.smal.common.core.stream_api.task;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

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

    private int[] buildNums() {
        return IntStream
                .iterate(0, i -> i + 1)
                .limit(10)
                .toArray();

    }
}