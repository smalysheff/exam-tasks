package ru.smal.leetcode.easy.easy67;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void addBinary() {
        assertEquals("110", solution.addBinary("101", "1"));
    }

    @Test
    void binaryCalc() {
        assertEquals("0", solution.toBinary("0"));
        assertEquals("1", solution.toBinary("1"));
        assertEquals("11111111", solution.toBinary("255"));
        assertEquals("100000000", solution.toBinary("256"));
    }
}