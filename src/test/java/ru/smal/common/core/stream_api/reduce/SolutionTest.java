package ru.smal.common.core.stream_api.reduce;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reduceSumTest() {
        assertEquals(6, solution.reduceSum(new int[]{1, 2, 3}));
        assertEquals(4, solution.reduceSum(new int[]{-1, 0, 2, 3}));
        assertEquals(200, solution.reduceSum(new int[]{-20, 20, 200}));
    }

    @Test
    void reduceConcatTest() {
        assertEquals("hello-java", solution.reduceConcat(new String[]{"hello", "java"}));
        assertEquals("default", solution.reduceConcat(new String[0]));
    }

    @Test
    void reduceLongestTest() {
        assertEquals("hello", solution.reduceLongest(new String[]{"hello", "java"}));
        assertEquals("default", solution.reduceLongest(new String[0]));
    }

    @Test
    void reduceAvgTest() {
        assertEquals(2, solution.reduceMin(new int[] {5, 2, 4}));
        assertEquals(0, solution.reduceMin(new int[0]));
    }

    @Test
    void reduceUpperGlueTest() {
        assertEquals("ABC", solution.reduceUpperGlue(new String[] {"a", "b", "c"}));
        assertEquals("", solution.reduceUpperGlue(new String[0]));
    }

    @Test
    void reduceCountTest() {
        assertEquals(4, solution.reduceCount(List.of(List.of("a", "b"), List.of("a", "b"))));
        assertEquals(0, solution.reduceCount(Collections.emptyList()));
    }
}