package ru.smal.book_solving_problem.chapter1;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.partitioningBy;

/**
 * Подсчет гласных и согласных.
 * Написать программу, которая подсчитывает
 * число гласных и согласных букв в заданной строке.
 * Сделать это для английского языка, который имеет пять гласных (а, е, i, о, и, y)
 */
public class Solution5 {

    private static final Set<Character> ALL_VOWELS = Set.of('a', 'e', 'i', 'o', 'u');

    public Pair<Integer, Integer> countVowelsAndConsonants(String text) {
        String onlyLetters = text.replaceAll("[^A-Za-z]", "").toLowerCase();
        int vowel = 0;
        int length = onlyLetters.length();

        for (char ch : onlyLetters.toCharArray()) {
            if (ALL_VOWELS.contains(ch)) {
                vowel++;
            }
        }
        return new Pair<>(vowel, length - vowel);
    }

    public Pair<Integer, Integer> countVowelsAndConsonantsFromBook(String str) {
        str = str.toLowerCase();
        int vowel = 0;
        int consonant = 0;

        for (char ch : str.toCharArray()) {
            if (ALL_VOWELS.contains(ch)) {
                vowel++;
            } else if (ch >= 'a' && ch <= 'z') {
                consonant++;
            }
        }
        return new Pair<>(vowel, consonant);
    }

    public Pair<Long, Long> countVowelsAndConsonantsUseStream(String str) {
        long allLetter = str.chars()
                .filter(Character::isLetter)
                .count();

        long vowels = str.chars()
                .filter(ch -> ALL_VOWELS.contains((char) ch))
                .count();

        return new Pair<>(vowels, allLetter - vowels);
    }

    public Pair<Long, Long> countVowelsAndConsonantsUseStreamTwo(String str) {
        Map<Boolean, Long> letters = str.chars()
                .mapToObj(Character.class::cast)
                .filter(Character::isLetter)
                .collect(partitioningBy(ALL_VOWELS::contains, counting()));

        return new Pair<>(letters.get(true), letters.get(false));
    }
}

record Pair<F, S>(F first, S second) {
}