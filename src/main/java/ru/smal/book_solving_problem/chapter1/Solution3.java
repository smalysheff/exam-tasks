package ru.smal.book_solving_problem.chapter1;

import java.util.Collections;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова, и программу, которая инвертирует буквы каждого слова и
 * сами слова.
 */
public class Solution3 {

    public static final String WHITESPACE = " ";
    public static final Pattern PATTERN = Pattern.compile(" +");

    public String reverseWordsFromBook(String str) {
        String[] words = str.split(WHITESPACE);

        StringBuilder reverseString = new StringBuilder();

        for (String word : words) {
            StringBuilder reverseWord = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                reverseWord.append(word.charAt(i));
            }
            reverseString.append(reverseWord).append(WHITESPACE);
        }
        return reverseString.toString().trim();
    }

    public String reverseWords(String text) {
        String[] split = text.split(WHITESPACE);

        StringBuilder reverseString = new StringBuilder();

        for (String str : split) {
            reverseString
                    .append(reverse(str))
                    .append(WHITESPACE);
        }

        return reverseString.toString().trim();
    }

    private static StringBuilder reverse(String text) {
        return new StringBuilder(text).reverse();
    }

    public String reverseWordsUseStream(String text) {
        return PATTERN.splitAsStream(text)
                .map(StringBuilder::new)
                .map(StringBuilder::reverse)
                .collect(Collectors.joining(" "));
    }

    public static String reverseWordsV2(String source) {
        return Stream.of(source.split("\\s+"))
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        words -> {
                            Collections.reverse(words);
                            return words.stream();
                        }
                )).collect(Collectors.joining(" "));
    }
}
