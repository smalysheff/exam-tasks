package ru.smal.simple_test;

import lombok.AccessLevel;
import lombok.experimental.FieldNameConstants;

import java.util.stream.IntStream;

public class Application {
    public static void main(String[] args) {
        String age = Person.Fields.AGE;

        System.out.println(age);

        System.out.println("range: \t\t\t" + IntStream.range(1, 10).boxed().toList());
        System.out.println("rangeClosed: \t" + IntStream.rangeClosed(1, 10).boxed().toList());
    }
}

@FieldNameConstants(level = AccessLevel.PUBLIC)
class Person {
    private String name;
    private int age;
}
