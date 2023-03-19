package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution9Test {

    private Solution9 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution9();
    }

    @Test
    void joinByDelimiterUseStream() {
        assertEquals("hello world", solution.joinByDelimiterUseStream(' ', new String[]{"hello", "world"}));
    }

    @Test
    void joinByDelimiterUseStringBuilder() {
        assertEquals("hello world java", solution.joinByDelimiterUseStringBuilder(' ', new String[]{"hello", "world", "java"}));
    }
}