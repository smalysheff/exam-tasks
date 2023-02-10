package ru.smal.common.core.stream_api.sum_count;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reduceCount() {
        assertEquals(4, solution.reduceCount(buildList()));
    }

    @Test
    void mapToIntCount() {
        assertEquals(4, solution.mapToIntCount(buildList()));
    }

    @Test
    void flatmapCount() {
        assertEquals(4, solution.flatmapCount(buildList()));
    }

    private List<List<String>> buildList() {
        return List.of(List.of("a", "b"), List.of("a", "b"));
    }
}