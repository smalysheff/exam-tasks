package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution2Test {

    private Solution2 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution2();
    }

    @Test
    void findFirstNonRepeatingCharUseForLoopTest() {
        assertEquals('j', solution.findFirstNonRepeatingChar("java"));
        assertEquals(Character.MIN_VALUE, solution.findFirstNonRepeatingChar("mama"));
    }

    @Test
    void findFirstNonRepeatingCharUseStreamTest() {
        assertEquals('j', solution.findFirstNonRepeatingCharUseStream("java"));
        assertEquals(Character.MIN_VALUE, solution.findFirstNonRepeatingCharUseStream("mama"));
    }
}