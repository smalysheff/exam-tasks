package ru.smal.book_solving_problem.chapter1;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;

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
                .collect(Collectors.groupingBy(identity(), counting()));
    }
}
