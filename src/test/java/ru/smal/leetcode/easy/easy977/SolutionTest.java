package ru.smal.leetcode.easy.easy977;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.leetcode.easy.easy977.Solution;

class SolutionTest {

    private static final int[] INITIAL_ARRAY = {-4,-1,0,3,10};
    private static final int[] EXPECTED_ARRAY = {0,1,9,16,100};

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void sortedSquaresTest() {
        Assertions.assertThat(solution.sortedSquaresStream(INITIAL_ARRAY))
                .isIn(EXPECTED_ARRAY);
    }

    @Test
    void sortedSquaresPriorityQueueTest() {
        Assertions.assertThat(solution.sortedSquaresPriorityQueue(INITIAL_ARRAY))
                .isIn(EXPECTED_ARRAY);
    }

    @Test
    void sortedSquaresDequeTest() {
        Assertions.assertThat(solution.sortedSquaresDeque(INITIAL_ARRAY))
                .isIn(EXPECTED_ARRAY);
    }

    @Test
    void sortedSquaresArrayTest() {
        Assertions.assertThat(solution.sortedSquaresArray(INITIAL_ARRAY))
                .isIn(EXPECTED_ARRAY);
    }

    @Test
    void sortedSquaresLinkedListTest() {
        Assertions.assertThat(solution.sortedSquaresLinkedList(INITIAL_ARRAY))
                .isIn(EXPECTED_ARRAY);
    }
}