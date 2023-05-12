package ru.smal.leetcode.medium.medium_151;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.medium.medium_151.Solution;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void reverseWordsUseForLoopList() {
        assertEquals("blue is sky the", solution.reverseWordsUseForLoopList("the sky is blue"));
        assertEquals("world hello", solution.reverseWordsUseForLoopList("  hello world  "));
        assertEquals("example good a", solution.reverseWordsUseForLoopList("a good   example"));
    }

    @Test
    void reverseWordsUseForLoopList1() {
        assertEquals("blue is sky the", solution.reverseWordsUseForLoopList1("the sky is blue"));
        assertEquals("world hello", solution.reverseWordsUseForLoopList1("  hello world  "));
        assertEquals("example good a", solution.reverseWordsUseForLoopList1("a good   example"));
    }

    @Test
    void reverseWordsUseStringBuilder() {
        assertEquals("blue is sky the", solution.reverseWordsUseStringBuilder("the sky is blue"));
        assertEquals("world hello", solution.reverseWordsUseStringBuilder("  hello world  "));
        assertEquals("example good a", solution.reverseWordsUseStringBuilder("a good   example"));
    }
}