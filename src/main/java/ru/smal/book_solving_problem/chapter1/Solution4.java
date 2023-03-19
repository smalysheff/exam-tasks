package ru.smal.book_solving_problem.chapter1;

import lombok.NonNull;

/**
 * Проверка, содержит ли строковое значение только цифры.
 * Написать программу, которая проверяет, что заданная строка содержит только цифры
 */
public class Solution4 {

    public boolean isDigitUsePattern(@NonNull String text) {
        return text.matches("\\d+");
    }

    public boolean isDigitUseForLoop(@NonNull String text) {
        if (text.isEmpty()) {
            return false;
        }
        for (char ch : text.toCharArray()) {
            if (!Character.isDigit(ch)) {
                return false;
            }
        }
        return true;
    }

    public boolean isDigitUseTryCatch(@NonNull String text) {
        try {
            Integer.parseInt(text);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isDigitUseStream(@NonNull String text) {
        if (text.isEmpty()) {
            return false;
        }
        return text.chars()
                .allMatch(Character::isDigit);
    }
}
