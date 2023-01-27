package ru.smal.easy.easy448;

import org.assertj.core.api.Assertions;
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
    void findDisappearedNumbers() {
        Assertions.assertThat(solution.findDisappearedNumbers(new int[]{4,3,2,7,8,2,3,1})).isEqualTo(List.of(5, 6));
        Assertions.assertThat(solution.findDisappearedNumbers(new int[]{1,1})).isEqualTo(List.of(2));
    }
}