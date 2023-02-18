package ru.smal.book_solving_problem.chapter_5;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * Разбиение элементов посредством коллектора
 * Collectors.partitioningByO
 */
public class Solution118 {
    public Map<Boolean, List<Integer>> partitioningMap(int[] items) {
        return IntStream.of(items)
                .boxed()
                .collect(Collectors.partitioningBy(n -> n % 2 == 0));
    }
}
