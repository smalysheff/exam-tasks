package ru.smal.common.core.stream_api.sum_count;

import java.util.Collection;
import java.util.List;

public class Solution {
    public int reduceCount(List<List<String>> lists) {
        return lists
                .stream()
                .map(Collection::size)
                .reduce(0, Integer::sum);
    }

    public int mapToIntCount(List<List<String>> lists) {
        return lists
                .stream()
                .mapToInt(Collection::size)
                .sum();
    }

    public long flatmapCount(List<List<String>> lists) {
        return lists
                .stream()
                .flatMap(Collection::stream)
                .count();
    }
}
