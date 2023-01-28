package ru.smal.common.sorting_algorithm;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    void setUp() {
        bubbleSort = new BubbleSort();
    }

    @Test
    void bubbleSortWhileLoop() {
        int[] actual = bubbleSort.bubbleSortWhileLoop(buildArray());
        check(actual);
    }

    @Test
    void bubbleSortForLoop() {
        int[] actual = bubbleSort.bubbleSortForLoop(buildArray());
        check(actual);
    }

    private int[] buildArray() {
        return new int[]{5, 4, 3, 2, 1};
    }

    private void check(int[] actual) {
        Assertions.assertThat(actual).isEqualTo(new int[]{1, 2, 3, 4, 5});
    }
}