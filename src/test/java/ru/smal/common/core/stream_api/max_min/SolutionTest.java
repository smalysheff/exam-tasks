package ru.smal.common.core.stream_api.max_min;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;
import java.util.List;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    void findByMaxDate() {
        List<Person> people = buildPersons();
        Person actual = solution.findByMaxDate(people);

        Assertions
                .assertThat(actual.birthday())
                .isEqualTo(LocalDate.of(2001, 9, 2));
    }

    @Test
    void findByMaxDateWithEmptyList() {
        Assertions
                .assertThatExceptionOfType(RuntimeException.class)
                .isThrownBy(() -> solution.findByMaxDate(Collections.emptyList()))
                .withMessage("Object not found");
    }


    @Test
    void findByMaxSalaryWithMethodReference() {
        List<Person> people = buildPersons();
        Person actual = solution.findByMaxSalaryWithMethodReference(people);

        Assertions
                .assertThat(actual.salary())
                .isEqualTo(44);
    }

    @Test
    void findByMaxSalaryWithLambda() {
        List<Person> people = buildPersons();
        Person actual = solution.findByMaxSalaryWithLambda(people);

        Assertions
                .assertThat(actual.salary())
                .isEqualTo(44);
    }

    @Test
    void findByMaxSalaryUsingCollect() {
        List<Person> people = buildPersons();
        Person actual = solution.findByMaxSalaryUsingCollect(people);

        Assertions
                .assertThat(actual.salary())
                .isEqualTo(44);
    }

    @Test
    void findByMaxSalaryUsingReduce() {
        List<Person> people = buildPersons();
        Person actual = solution.findByMaxSalaryUsingReduce(people);

        Assertions
                .assertThat(actual.salary())
                .isEqualTo(44);
    }

    private List<Person> buildPersons() {
        return List.of(
                new Person(LocalDate.of(2000, 8, 1), 12),
                new Person(LocalDate.of(2001, 9, 2), 44),
                new Person(LocalDate.of(1990, 10, 3), 38)
        );
    }
}