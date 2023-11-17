package ru.smal.common.core.stream_api.tasks;

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

    @Test
    void fizzBuzzUseForLoopTest2() {
        Assertions.assertThat(solution.fizzBuzzUseForLoop())
                .isEqualTo(expectedFor100());
    }

    @Test
    void fizzBuzzUseStream() {
        Assertions.assertThat(solution.fizzBuzzUseStream(1, 101))
                .isEqualTo(expectedFor100());
    }

    private int[] buildNums() {
        return IntStream
                .range(1, 20)
                .toArray();
    }

    private Object[] expected() {
        return new Object[]{
                1, 2, "Fizz", 4, "Buzz", "Fizz", 7, 8, "Fizz", "Buzz", 11, "Fizz", 13, 14, "FizzBuzz", 16, 17, "Fizz", 19, "Buzz"
        };
    }

    private Object[] expectedFor100() {
        return new Object[]{
                1,
                2,
                "Fizz",
                4,
                "Buzz",
                "Fizz",
                7,
                8,
                "Fizz",
                "Buzz",
                11,
                "Fizz",
                13,
                14,
                "FizzBuzz",
                16,
                17,
                "Fizz",
                19,
                "Buzz",
                "Fizz",
                22,
                23,
                "Fizz",
                "Buzz",
                26,
                "Fizz",
                28,
                29,
                "FizzBuzz",
                31,
                32,
                "Fizz",
                34,
                "Buzz",
                "Fizz",
                37,
                38,
                "Fizz",
                "Buzz",
                41,
                "Fizz",
                43,
                44,
                "FizzBuzz",
                46,
                47,
                "Fizz",
                49,
                "Buzz",
                "Fizz",
                52,
                53,
                "Fizz",
                "Buzz",
                56,
                "Fizz",
                58,
                59,
                "FizzBuzz",
                61,
                62,
                "Fizz",
                64,
                "Buzz",
                "Fizz",
                67,
                68,
                "Fizz",
                "Buzz",
                71,
                "Fizz",
                73,
                74,
                "FizzBuzz",
                76,
                77,
                "Fizz",
                79,
                "Buzz",
                "Fizz",
                82,
                83,
                "Fizz",
                "Buzz",
                86,
                "Fizz",
                88,
                89,
                "FizzBuzz",
                91,
                92,
                "Fizz",
                94,
                "Buzz",
                "Fizz",
                97,
                98,
                "Fizz",
                "Buzz"
        };
    }


}