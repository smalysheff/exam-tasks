package ru.smal.book_solving_problem.chapter1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Solution8Test {

    @Test
    void deleteWhitespace() {
        Solution8 solution = new Solution8();

        assertEquals("helloworld", solution.removeWhitespaces("hello world "));
    }

    @Test
    void deleteWhitespaceTwo() {
        Solution8 solution = new Solution8();

        assertEquals("helloworld", solution.removeWhitespacesUseForLoop("hello world "));
    }
}