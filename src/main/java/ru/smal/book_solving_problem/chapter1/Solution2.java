package ru.smal.book_solving_problem.chapter1;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

/**
 * Отыскание первого неповторяющегося символа.
 * Написать программу, которая возвращает первый неповторяющийся (некратный) символ в заданной строке
 *
 * В варианте с одним обходом мы заполняем массив, предусмотренный для хранения
 * индексов всех символов, которые появляются в строке ровно один раз. Имея этот
 * массив, просто надо вернуть наименьший индекс, в котором содержится неповторяющийся символ:
 */
public class Solution2 {

    public Character findFirstNonRepeatingChar(String text) {
        Map<Character, Integer> result = new LinkedHashMap<>();

        for (char ch : text.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }

        for (Map.Entry<Character, Integer> entry : result.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return Character.UNASSIGNED;
    }

    public Character findFirstNonRepeatingCharUseStream(String text) {
        LinkedHashMap<Integer, Long> chars = text.codePoints()
                .boxed()
                .collect(Collectors.groupingBy(identity(), LinkedHashMap::new, counting()));

        int result = chars.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1L)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElse((int) Character.MIN_VALUE);

        return (char) result;
    }
}
