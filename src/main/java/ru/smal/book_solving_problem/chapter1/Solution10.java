package ru.smal.book_solving_problem.chapter1;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Генерирование всех перестановок
 */
public class Solution10 {

    public Set<String> permute(String text) {
        return permute("", text);
    }

    private Set<String> permute(String prefix, String text) {
        if (Objects.isNull(text)) {
            return null;
        }
        Set<String> result = new HashSet<>();
        int length = text.length();

        if (length == 0) {
            result.add(prefix);
        } else {
            for (int i = 0; i < length; i++) {
                result.addAll(Objects.requireNonNull(
                        permute(prefix + text.charAt(i), text.substring(i + 1, length) + text.substring(0, i)))
                );
            }
        }
        return result;
    }
}
