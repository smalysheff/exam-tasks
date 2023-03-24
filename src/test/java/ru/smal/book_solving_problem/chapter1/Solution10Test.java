package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class Solution10Test {

    private Solution10 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution10();
    }

    @Test
    void permuteNullArgTest() {
        assertNull(solution.permute(null));
    }

    @Test
    void permuteTest() {
        assertEquals(Set.of("AB", "BA"), solution.permute("AB"));
        assertEquals(Set.of("АВС", "АСВ", "ВСА", "ВАС", "CAB", "СВА"), solution.permute("ABC"));
    }
}