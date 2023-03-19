package ru.smal.leetcode.easy.easy58;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.easy.easy58.Solution;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void lengthOfLastWord() {
        Assertions.assertThat(solution.lengthOfLastWord("Hello World")).isEqualTo(5);
        Assertions.assertThat(solution.lengthOfLastWord("   fly me   to   the moon  ")).isEqualTo(4);
        Assertions.assertThat(solution.lengthOfLastWord("luffy is still joyboy")).isEqualTo(6);
    }
}