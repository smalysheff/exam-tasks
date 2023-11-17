package ru.smal.book_solving_problem.chapter1;

import lombok.Data;

import java.util.stream.IntStream;

/**
 * . Проверка, что строка является палиндромом
 */
public class Solution11 {

    public boolean isPalindromeUseStringBuilder(String text) {
        StringBuilder builder = new StringBuilder(text.replaceAll("[^A-Za-z0-9]+", ""));
        return builder.toString().equals(builder.reverse().toString());
    }

    // Use two pointers
    public boolean isPalindromeUseWhileLoop(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (right > left) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public boolean isPalindromeUseStream(String text) {
        return IntStream.range(0, text.length() / 2)
                .allMatch(i -> text.charAt(i) == text.charAt(text.length() - i - 1));
    }
}
