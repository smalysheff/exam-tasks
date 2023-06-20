package ru.smal.book_solving_problem.chapter1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;

class Solution15Test {

    private Solution15 solution;

    @BeforeEach
    void setUp() {
        solution = new Solution15();
    }

    @Test
    void sortArrayByLength() {
        String[] source = buildArray();
        solution.sortArrayByLength(source);

        check(source);
    }

    @Test
    void sortArrayByLengthV2() {
        String[] source = buildArray();
        solution.sortArrayByLengthV2(source, Solution15.Sort.ASC);

        check(source);
    }

    @Test
    void sortArrayByLengthV2Reverse() {
        String[] source = buildArray();
        solution.sortArrayByLengthV2(source, Solution15.Sort.DESC);

        String[] expected = {"Java", "Program", "Developer", "Concurrency", "Inheritancee", "Multithreading"};
        Collections.reverse(Arrays.asList(expected));
        Assertions.assertThat(source).isEqualTo(expected);
    }

    @Test
    void sortArrayByLengthV3() {
        String[] source = buildArray();
        solution.sortArrayByLengthV3(source, Solution15.Sort.DESC);

        String[] expected = {"Java", "Program", "Developer", "Concurrency", "Inheritancee", "Multithreading"};
        Collections.reverse(Arrays.asList(expected));
        Assertions.assertThat(source).isEqualTo(expected);
    }


    private void check(String[] actual) {
        String[] expected = {"Java", "Program", "Developer", "Concurrency", "Inheritancee", "Multithreading"};
        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private static String[] buildArray() {
        return new String[]{"Java", "Concurrency", "Multithreading", "Program", "Developer", "Inheritancee"};
    }
}