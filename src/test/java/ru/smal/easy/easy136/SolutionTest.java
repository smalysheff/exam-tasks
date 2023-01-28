package ru.smal.easy.easy136;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void singleNumber() {
        Assertions.assertThat(solution.singleNumber(new int[]{1})).isEqualTo(1);
        Assertions.assertThat(solution.singleNumber(new int[]{2, 2, 1})).isEqualTo(1);
        Assertions.assertThat(solution.singleNumber(new int[]{4, 1, 2, 1, 2})).isEqualTo(4);
    }
}