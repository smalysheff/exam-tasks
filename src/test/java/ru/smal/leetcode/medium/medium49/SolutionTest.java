package ru.smal.leetcode.medium.medium49;

import org.assertj.core.api.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void groupAnagrams() {
        List<List<String>> actual = solution.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        Assertions.assertThat(actual).hasSameElementsAs(actual);
    }
}