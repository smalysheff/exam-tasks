package ru.smal.book_solving_problem.chapter_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class Solution118Test {

    private final static int[] INITIAL_ARRAY = {1, 2, 3, 4, 5};
    private final static Map<Boolean, List<Integer>> EXPECTED_MAP = Map.of(
            true, List.of(2, 4),
            false, List.of(1, 3, 5)
    );

    private Solution118 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution118();
    }

    @Test
    void partitioningMapTest() {
        Map<Boolean, List<Integer>> actualMap = solution.partitioningMap(INITIAL_ARRAY);
        Assertions.assertEquals(EXPECTED_MAP, actualMap);
    }
}