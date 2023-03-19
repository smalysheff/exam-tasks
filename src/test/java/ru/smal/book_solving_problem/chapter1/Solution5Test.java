package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution5Test {

    private Solution5 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution5();
    }

    @Test
    void countVowelsAndConsonantsTest() {
        Pair<Integer, Integer> expected = new Pair<>(10, 14);
        assertEquals(expected, solution.countVowelsAndConsonants("java, write once run anywhere?"));
    }

    @Test
    void countVowelsAndConsonantsForBookTest() {
        Pair<Integer, Integer> expected = new Pair<>(10, 14);
        assertEquals(expected, solution.countVowelsAndConsonantsFromBook("java, write once run anywhere?"));
    }

    @Test
    void countVowelsAndConsonantsUseStreamTest() {
        Pair<Long, Long> expected = new Pair<>(10L, 14L);
        assertEquals(expected, solution.countVowelsAndConsonantsUseStream("java, write once run anywhere?"));
    }

    @Test
    void countVowelsAndConsonantsUseStreamTwoTest() {
        Pair<Long, Long> expected = new Pair<>(10L, 14L);
        assertEquals(expected, solution.countVowelsAndConsonantsUseStreamTwo("java, write once run anywhere?"));
    }
}