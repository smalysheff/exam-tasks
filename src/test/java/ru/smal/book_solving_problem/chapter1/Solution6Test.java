package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution6Test {

    private Solution6 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution6();
    }

    @Test
    void countOccurrencesOfACertainCharacterOneTest() {
        assertEquals(2, solution.countOccurrencesOfACertainCharacterOne("concurrent", 'r'));
    }

    @Test
    void countOccurrencesOfACertainCharacterTwoTest() {
        assertEquals(2, solution.countOccurrencesOfACertainCharacterTwo("concurrent", 'r'));
    }

    @Test
    void countCharacterTwo() {
        assertEquals(2, solution.countOccurrencesOfACertainCharacterUseStream("concurrent", 'r'));
    }
}