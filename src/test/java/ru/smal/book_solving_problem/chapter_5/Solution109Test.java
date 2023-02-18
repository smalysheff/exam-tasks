package ru.smal.book_solving_problem.chapter_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Solution109Test {

    private Solution109 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution109();
    }

    @Test
    void createUnmodifiableCollections2() {
        Assertions.assertThrows(UnsupportedOperationException.class,
                () -> solution.createUnmodifiableCollections2().add(new ImmutableMelon("test", 10))
        );
    }
}