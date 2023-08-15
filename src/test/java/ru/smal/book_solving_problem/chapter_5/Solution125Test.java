package ru.smal.book_solving_problem.chapter_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Comparator;
import java.util.stream.IntStream;
import java.util.stream.Stream;


class Solution125Test {

    private Solution125 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution125();
    }

    @Test
    void minMaxArray_StringLength() {
        Solution125.Pair<String, String> actual = solution.minMaxArray(getStringArray(), Comparator.comparing(String::length));

        Solution125.Pair<String, String> expected = Solution125.Pair.of("run", "everywhere");

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void minMaxArray_StringAlphabet() {
        Solution125.Pair<String, String> actual = solution.minMaxArray(getStringArray(), String::compareToIgnoreCase);

        Solution125.Pair<String, String> expected = Solution125.Pair.of("everywhere", "Write");

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    @Test
    void minMaxArray_Integer() {
        Solution125.Pair<Integer, Integer> actual = solution.minMaxArray(getIntegerArray(), Integer::compareTo);

        Solution125.Pair<Integer, Integer> expected = Solution125.Pair.of(0, 9);

        Assertions.assertThat(actual).usingRecursiveComparison().isEqualTo(expected);
    }

    private String[] getStringArray() {
        return Stream
                .of("Write", "once", "run", "everywhere")
                .toArray(String[]::new);
    }

    private Integer[] getIntegerArray() {
        return IntStream.range(0, 10)
                .boxed()
                .toArray(Integer[]::new);
    }
}