package ru.smal.book_solving_problem;

/**
 * Инвертирование букв и слов.
 * Написать программу, которая инвертирует буквы каждого слова, и программу, которая инвертирует буквы каждого слова и
 * сами слова.
 */
public class Solution3 {

    public static final String WHITE_SPASE = " ";

    public String reverseChars(String text) {
        String[] split = text.split(WHITE_SPASE);

        StringBuilder reverseWords = new StringBuilder();

        for (String str : split) {
            reverseWords
                    .append(reverse(str))
                    .append(WHITE_SPASE);
        }

        return reverseWords.toString().trim();
    }

    public String reverseCharsAndWord(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    private StringBuilder reverse(String text) {
        return new StringBuilder(text).reverse();
    }
}
