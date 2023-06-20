package ru.smal.book_solving_problem.chapter1;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * Удаление повторяющихся символов. Написать программу, которая удаляет
 * повторяющиеся символы из заданной строки.
 */
public class Solution12 {

    public String removeDuplicateUseSB(String text) {
        StringBuilder result = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if (result.indexOf(String.valueOf(ch)) == -1) {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public String removeDuplicateUseStream(String text) {
        return Arrays.stream(text.split(""))
                .distinct()
                .collect(Collectors.joining());
    }

    public String removeDuplicateUseStream1(String text) {
        return text.chars()
                .distinct()
                .collect(
                        StringBuilder::new,
                        StringBuilder::appendCodePoint,
                        StringBuilder::append)
                .toString();
    }


}
