package ru.smal.book_solving_problem.chapter1;

/**
 * Подсчет появлений некоторого символа.
 * Написать программу, которая подсчитывает появления того или иного символа в заданной строке.
 */
public class Solution6 {

    public int countOccurrencesOfACertainCharacterOne(String text, char ch) {
        int count = 0;
        for (char c : text.toCharArray()) {
            if (c == ch) {
                count++;
            }
        }
        return count;
    }

    public int countOccurrencesOfACertainCharacterTwo(String text, char ch) {
        return text.length() - text.replace(String.valueOf(ch), "").length();
    }

    public long countOccurrencesOfACertainCharacterUseStream(String text, char ch) {
        return text.chars()
                .filter(c -> c == ch)
                .count();
    }
}
