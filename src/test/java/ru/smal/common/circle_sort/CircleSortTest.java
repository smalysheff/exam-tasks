package ru.smal.common.circle_sort;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.smal.common.sorting_algorithm.CircleSort;

class CircleSortTest {

    private CircleSort sort;

    @BeforeEach
    void setUp() {
        sort = new CircleSort();
    }

    @Test
    void circleSort() {
        Assertions.assertThat(sort.circleSort(new int[]{4, 3, 5, 2, 1})).isEqualTo(new int[]{1, 2, 3, 4, 5});
        Assertions.assertThat(sort.circleSort(new int[]{4,3,2,7,8,2,3,1})).isEqualTo(new int[]{1,2,3,4,3,2,7,8});
    }
}