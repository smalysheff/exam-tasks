package ru.smal.simple_test;

import org.springframework.util.ObjectUtils;

public class Application {

    public static void main(String[] args) {

        System.out.println(isEmpty(""));

    }

    private static boolean isEmpty(String str) {
        return ObjectUtils.isEmpty(str);
    }
}
