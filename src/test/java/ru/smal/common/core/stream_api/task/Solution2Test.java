package ru.smal.common.core.stream_api.task;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

class Solution2Test {

    private Solution2 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution2();
    }

    @Test
    void fizzBuzzUseForLoopTest() {
        Assertions.assertThat(solution.fizzBuzzUseForLoop(buildNums()))
                .isEqualTo(expected());
    }

    @Test
    void fizzBuzzUseStreamTest() {
        Assertions.assertThat(solution.fizzBuzzUseStream(buildNums()))
                .isEqualTo(expected());
    }

    private int[] buildNums() {
        return IntStream
                .iterate(1, i -> i + 1)
                .limit(20)
                .toArray();
    }

    private Object[] expected() {
        return new Object[]{
                1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16, 17, "Fizz", 19, "Buzz"
        };
    }
}