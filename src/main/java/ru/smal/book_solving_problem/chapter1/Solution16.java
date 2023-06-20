package ru.smal.book_solving_problem.chapter1;

import java.util.Arrays;

/**
 * Проверка наличия подстроки в строке.
 * Написать программу, которая проверяет, содержит ли заданная строка заданную подстроку.
 */
public class Solution16 {
    public boolean isSubstring(String text, String substring) {
        return Arrays.asList(text.split(" ")).contains(substring);
    }
}
