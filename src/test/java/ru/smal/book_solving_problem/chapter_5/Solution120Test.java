package ru.smal.book_solving_problem.chapter_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class Solution120Test {

    private static final List<Melon> INITIAL_MELONS = List.of(
            new Melon("type1", 1000),
            new Melon("type2", 1500),
            new Melon("type3", 2000)
    );

    private static final List<Melon> EXPECTED_MELONS = List.of(
            new Melon("type2", 1500),
            new Melon("type3", 2000)
    );

    private static final List<String> INITIAL_TYPES = List.of("type2", "type3");

    private Solution120 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution120();
    }

    @Test
    void containsItemsTest() {
        List<Melon> actual = solution.containsItems(INITIAL_MELONS, INITIAL_TYPES);
        Assertions.assertThat(actual).isEqualTo(EXPECTED_MELONS);
    }

    @Test
    void containsItemsWithHashSetTest() {
        List<Melon> actual = solution.containsItemsWithHashSet(INITIAL_MELONS, INITIAL_TYPES);
        Assertions.assertThat(actual).isEqualTo(EXPECTED_MELONS);
    }
}