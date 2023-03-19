package ru.smal.book_solving_problem.chapter1;

/**
 * Удаление пробелов из строки.
 * Написать программу, которая удаляет все пробелы из заданной строки.
 */
public class Solution8 {

    public String removeWhitespaces(String text) {
        return text.replaceAll("\\s", "");
    }

    public String removeWhitespacesUseForLoop(String text) {
        StringBuilder result = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (c != ' ') {
                result.append(c);
            }
        }
        return result.toString();
    }
}
