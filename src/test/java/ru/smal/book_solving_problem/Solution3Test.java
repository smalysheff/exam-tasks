package ru.smal.book_solving_problem;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.book_solving_problem.chapter1.Solution3;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {

    private Solution3 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution3();
    }

    @Test
    void reverseWordsFromBook() {
        assertEquals("olleh dlrow", solution.reverseWordsFromBook("hello world"));
    }

    @Test
    void reverseWords() {
        assertEquals("olleh dlrow", solution.reverseWords("hello world"));
    }

    @Test
    void reverseWordsUseStream() {
        assertEquals("olleh dlrow", solution.reverseWordsUseStream("hello world"));
    }
}