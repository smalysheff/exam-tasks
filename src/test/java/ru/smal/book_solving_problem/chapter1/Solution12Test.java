package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution12Test {

    private Solution12 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution12();
    }

    @Test
    void removeDuplicateCharacters() {
        assertEquals("jav", solution.removeDuplicateUseSB("java"));
    }

    @Test
    void removeDuplicateCharactersUseStream() {
        assertEquals("jav", solution.removeDuplicateUseStream("java"));
    }

    @Test
    void removeDuplicateCharactersUseStream1() {
        assertEquals("jav", solution.removeDuplicateUseStream1("java"));
    }
}