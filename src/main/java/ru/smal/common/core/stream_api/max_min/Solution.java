package ru.smal.common.core.stream_api.max_min;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

    private static final String OBJECT_NOT_FOUND = "Object not found";

    public Person findByMaxDate(List<Person> people) {
        return people
                .stream()
                .max(Comparator.comparing(Person::birthday))
                .orElseThrow(() -> new RuntimeException(OBJECT_NOT_FOUND));
    }

    public Person findByMaxSalaryWithMethodReference(List<Person> people) {
        return people
                .stream()
                .max(Comparator.comparingInt(Person::salary))
                .orElseThrow(() -> new RuntimeException(OBJECT_NOT_FOUND));
    }

    public Person findByMaxSalaryWithLambda(List<Person> people) {
        return people
                .stream()
                .max((x, y) -> x.salary() - y.salary())
//                .max((x, y) -> Integer.compare(x.salary(), y.salary()))
                .orElseThrow(() -> new RuntimeException(OBJECT_NOT_FOUND));
    }

    public Person findByMaxSalaryUsingCollect(List<Person> people) {
        return people
                .stream()
                .collect(Collectors.maxBy((x, y) -> x.salary() - y.salary()))
//                .collect(Collectors.maxBy(Comparator.comparing(Person::salary)))
                .orElseThrow(() -> new RuntimeException(OBJECT_NOT_FOUND));
    }

    public Person findByMaxSalaryUsingReduce(List<Person> people) {
        return people
                .stream()
                .reduce((x, y) -> x.salary() > y.salary() ? x : y)
                .orElseThrow(() -> new RuntimeException(OBJECT_NOT_FOUND));
    }

}

record Person(LocalDate birthday, int salary) {
}
