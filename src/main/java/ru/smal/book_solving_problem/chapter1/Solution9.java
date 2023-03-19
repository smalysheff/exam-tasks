package ru.smal.book_solving_problem.chapter1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 9. Соединение нескольких строк
 * с помощью разделителя
 */
public class Solution9 {

    public String joinByDelimiterUseStream(char delimiter, String[] words) {
        return Stream.of(words)
                .collect(Collectors.joining(String.valueOf(delimiter)));
    }

    public String joinByDelimiterUseStringBuilder(char delimiter, String[] words) {
        StringBuilder joining = new StringBuilder();

        int i = 0;
        for (; i < words.length - 1; i++) {
            joining.append(words[i])
                    .append(delimiter);
        }
        joining.append(words[i]);

        return joining.toString();
    }
}
