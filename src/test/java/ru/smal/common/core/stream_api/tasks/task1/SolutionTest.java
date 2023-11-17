package ru.smal.common.core.stream_api.tasks.task1;

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
    void findSurnameByFirstChar() {
        List<String> actual = solution.findSurnameByFirstChar(List.of("Ivan", "Stepan", "Inokentiy"), 'I');
        assertEquals(List.of("Ivan", "Inokentiy"), actual);
    }

    @Test
    void findSurnameByFirstChar_NotFound() {
        List<String> actual = solution.findSurnameByFirstChar(List.of("Ivan", "Stepan", "Inokentiy"), 'M');
        assertEquals(List.of(), actual);
    }
}