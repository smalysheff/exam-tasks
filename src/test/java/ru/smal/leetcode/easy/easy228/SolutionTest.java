package ru.smal.leetcode.easy.easy228;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.easy.easy228.Solution;

import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }
    @Test
    void summaryRanges() {
        Assertions.assertThat(solution.summaryRanges(new int[]{0, 1,})).isEqualTo(List.of("0->1"));
        Assertions.assertThat(solution.summaryRanges(new int[]{0,1,2,4,5,7})).isEqualTo(List.of("0->2","4->5","7"));
        Assertions.assertThat(solution.summaryRanges(new int[]{0,2,3,4,6,8,9})).isEqualTo(List.of("0","2->4","6","8->9"));
    }
}