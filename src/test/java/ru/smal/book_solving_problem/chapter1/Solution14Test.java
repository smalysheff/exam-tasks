package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution14Test {

    private Solution14 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution14();
    }

    @Test
    void maxOccurrenceCharacter() {
        assertEquals("a", solution.maxOccurrenceCharacter("Java"));
        assertEquals("a", solution.maxOccurrenceCharacter("aaaa"));
        assertEquals("", solution.maxOccurrenceCharacter(""));
        assertEquals(" ", solution.maxOccurrenceCharacter("Alula – a part of a birds wing"));
        assertNotEquals("v", solution.maxOccurrenceCharacter("Java"));
    }

    @Test
    void maxOccurrenceCharacterWithStream() {
        assertEquals("a", solution.maxOccurrenceCharacterWithStream("Java"));
        assertEquals("a", solution.maxOccurrenceCharacterWithStream("aaaa"));
        assertEquals("", solution.maxOccurrenceCharacterWithStream(""));
        assertEquals(" ", solution.maxOccurrenceCharacterWithStream("Alula – a part of a birds wing"));
        assertNotEquals("v", solution.maxOccurrenceCharacterWithStream("Java"));
    }

    @Test
    void countingEntries() {
        Map<Integer, Long> expected = Map.of(1, 1L, 2, 3L, 3, 1L, 4, 4L);
        Map<Integer, Long> actual = solution.countingEntries(new int[]{1, 2, 2, 2, 3, 4, 4, 4, 4});
        assertEquals(expected, actual);
    }
}