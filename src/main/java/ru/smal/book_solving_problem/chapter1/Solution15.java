package ru.smal.book_solving_problem.chapter1;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Сортировка массива строк по длине.
 * Написать программу, которая сортирует заданный массив по длине строк.
 */
public class Solution15 {

    public void sortArrayByLength(String[] source) {
        for (int i = 0; i < source.length; i++) {
            for (int j = i; j < source.length - 1; j++) {
                if (source[i].length() > source[j + 1].length()) {
                    swap(source, i, j + 1);
                }
            }
        }
    }

    private void swap(String[] source, int i, int j) {
        String temp = source[i];
        source[i] = source[j];
        source[j] = temp;
    }

    //old implementation
    public void sortArrayByLengthV2(String[] source, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            Arrays.sort(source, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
        } else {
            Arrays.sort(source, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        }
    }

    public void sortArrayByLengthV3(String[] source, Sort direction) {
        if (direction.equals(Sort.ASC)) {
            Arrays.sort(source, Comparator.comparingInt(String::length));
        } else {
            Arrays.sort(source, Comparator.comparingInt(String::length).reversed());
        }
    }

    enum Sort{
        ASC,
        DESC
    }
}
