package ru.smal.book_solving_problem.chapter1;

/**
 * Удаление начальных и замыкающих пробелов
 */
public class Solution21 {

    public String trimNormalize(String text) {
        if (text == null) {
            return null;
        }
        return text.replaceAll("\\s+", "");
    }

    public String trimNormalizeV2(String text) {
        if (text == null) {
            return null;
        }
        return text.trim();
    }

    public String trimNormalizeV3(String text) {
        if (text == null) {
            return null;
        }
        return text.strip();
    }
}
