package ru.smal.book_solving_problem.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Отыскание символа с наибольшим числом появлений.
 * Написать программу, которая отыскивает символ с наибольшим числом появлений в заданной строке
 * Java -> a
 */
public class Solution14 {

    public String maxOccurrenceCharacter(String text) {
        Map<Character, Integer> chars = new HashMap<>();
        for (Character ch : text.toCharArray()) {
            if (chars.containsKey(ch)) {
                chars.computeIfPresent(ch, (k, v) -> v + 1);
            } else {
                chars.put(ch, 1);
            }
        }
        return chars.entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .orElse("");
    }

    public String maxOccurrenceCharacterWithStream(String text) {
        return text.chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(ch -> ch, Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .map(String::valueOf)
                .orElse("");
    }

    public Map<Integer, Long> countingEntries(int[] nums) {
        return IntStream.of(nums)
                .boxed()
                .collect(Collectors.groupingBy(n -> n, Collectors.counting()));
    }
}
