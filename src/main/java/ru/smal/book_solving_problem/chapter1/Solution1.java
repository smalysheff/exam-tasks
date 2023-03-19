package ru.smal.book_solving_problem.chapter1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Подсчет повторяющихся символов.
 * Написать программу, которая подсчитывает повторяющиеся символы в заданной строке
 */
public class Solution1 {

    public Map<Character, Integer> countDuplicateCharactersUseForLoop(String text) {
        Map<Character, Integer> result = new HashMap<>();
        for (char ch : text.toCharArray()) {
            result.compute(ch, (k, v) -> (v == null) ? 1 : ++v);
        }
        return result;
    }

    public Map<Character, Long> countDuplicateCharactersUseStream(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .collect(groupingBy(identity(), counting()));
    }

    public Map<Integer, Long> calculateRepeatsUseStream(List<Integer> input) {
        return input.stream()
                .collect(groupingBy(identity(), counting()));

    }

    // bad
    public Map<Integer, Integer> calculateRepeatsUseForLoop(List<Integer> input) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Integer num : input) {
            if (result.containsKey(num)) {
                result.put(num, result.get(num) + 1);
            } else {
                result.put(num, 1);
            }
        }

        return result;
    }

    public Map<Integer, Integer> calculateRepeatsUseCompute(List<Integer> input) {
        Map<Integer, Integer> result = new HashMap<>();

        for (Integer num : input) {
            result.compute(num, (k, v) -> (v == null) ? 1 : ++v);
        }

        return result;
    }
}
