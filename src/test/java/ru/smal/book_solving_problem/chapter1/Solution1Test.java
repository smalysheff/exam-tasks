package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Solution1Test {

    private Solution1 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution1();
    }

    @Test
    void countDuplicateCharactersUseForLoopTest() {
        Map<Character, Integer> expected = buildCharacterIntegerMap();
        Map<Character, Integer> actual = solution.countDuplicateCharactersUseForLoop("java developer");

        assertEquals(expected, actual);
    }

    @Test
    void countDuplicateCharactersUseStreamTest() {
        Map<Character, Long> expected = buildCharacterLongMap();
        Map<Character, Long> actual = solution.countDuplicateCharactersUseStream("java developer");

        assertEquals(expected, actual);
    }

    @Test
    void calculateRepeatsUseStream() {
        Map<Integer, Long> expected = Map.of(1, 2L, 2, 3L, 3, 1L);
        Map<Integer, Long> actual = solution.calculateRepeatsUseStream(List.of(1, 1, 2, 2, 2, 3));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRepeatsUseForLoop() {
        Map<Integer, Integer> expected = Map.of(1, 2, 2, 3, 3, 1);
        Map<Integer, Integer> actual = solution.calculateRepeatsUseForLoop(List.of(1, 1, 2, 2, 2, 3));

        assertEquals(expected, actual);
    }

    @Test
    void calculateRepeatsUseCompute() {
        Map<Integer, Integer> expected = Map.of(1, 2, 2, 3, 3, 1);
        Map<Integer, Integer> actual = solution.calculateRepeatsUseCompute(List.of(1, 1, 2, 2, 2, 3));

        assertEquals(expected, actual);
    }


    private static Map<Character, Integer> buildCharacterIntegerMap() {
        return Map.of(
                'j', 1,
                'a', 2,
                'v', 2,
                ' ', 1,
                'd', 1,
                'e', 3,
                'l', 1,
                'o', 1,
                'p', 1,
                'r', 1
        );
    }
    private static Map<Character, Long> buildCharacterLongMap() {
        return Map.of(
                'j', 1L,
                'a', 2L,
                'v', 2L,
                ' ', 1L,
                'd', 1L,
                'e', 3L,
                'l', 1L,
                'o', 1L,
                'p', 1L,
                'r', 1L
        );
    }
}