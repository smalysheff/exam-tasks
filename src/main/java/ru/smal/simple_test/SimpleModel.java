package ru.smal.simple_test;

import lombok.Getter;

@Getter
public class SimpleModel {
    private final String name;
    private final int age;

    public SimpleModel(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static SimpleModel of(String name, int age) {
        return new SimpleModel(name, age);
    }
}
