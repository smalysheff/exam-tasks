package ru.smal.book_solving_problem.chapter_5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class Solution121Test {

    private Solution121 solution;
    private List<Melon> sourceMelons;
    private List<Melon> modifiedMelons;

    @BeforeEach
    void setUp() {
        solution = new Solution121();
        sourceMelons = createSourceMelons();
        modifiedMelons = createModifiedMelons();
    }

    @AfterEach
    void after() {
        sourceMelons = new ArrayList<>();
    }

    @Test
    void replaceElementsV1() {
        check(solution.replaceElementsV1(sourceMelons));
    }

    @Test
    void replaceElementsV2() {
        check(solution.replaceElementsV2(sourceMelons));
    }

    @Test
    void replaceElementsV3() {
        check(solution.replaceElementsV3(sourceMelons));
    }

    private void check(List<Melon> actual) {
        Assertions.assertThat(actual)
                .usingRecursiveComparison()
                .isEqualTo(modifiedMelons);
    }

    private List<Melon> createSourceMelons() {
        return new ArrayList<>() {{
            add(new Melon("Apollo", 3000));
            add(new Melon("Jade Dew", 3500));
            add(new Melon("Cantaloupe", 1500));
            add(new Melon("Gac", 1600));
            add(new Melon("Hami", 1400));
        }};
    }

    private List<Melon> createModifiedMelons() {
        return new ArrayList<>() {{
            add(new Melon("Apollo", 3000));
            add(new Melon("Jade Dew", 3500));
            add(new Melon("Cantaloupe", 3000));
            add(new Melon("Gac", 3000));
            add(new Melon("Hami", 3000));
        }};
    }
}