package ru.smal.easy.easy69;

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
    void mySqrtWhileLoop() {
        Assertions.assertThat(solution.mySqrtWhileLoop(4)).isEqualTo(2);
        Assertions.assertThat(solution.mySqrtWhileLoop(8)).isEqualTo(2);
        Assertions.assertThat(solution.mySqrtWhileLoop(16)).isEqualTo(4);
        Assertions.assertThat(solution.mySqrtWhileLoop(30)).isEqualTo(5);
        Assertions.assertThat(solution.mySqrtWhileLoop(2147395599)).isEqualTo(46339);
    }

}