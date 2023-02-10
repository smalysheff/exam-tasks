package ru.smal.common.core.stream_api.reduce;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution {

    public int reduceSum(int[] nums) {
        return IntStream
                .of(nums)
                .reduce((sum1, sum2) -> sum1 + sum2)
                .orElse(0);
    }

    public String reduceConcat(String[] strings) {
        return Arrays
                .stream(strings)
                .reduce((word1, word2) -> word1 + "-" + word2)
                .orElse("default");
    }

    public String reduceLongest(String[] strings) {
        return Arrays
                .stream(strings)
                .reduce((word1, word2) -> word1.length() > word2.length() ? word1 : word2)
                .orElse("default");
    }

    public int reduceMin(int[] nums) {
        return IntStream.of(nums)
                .reduce(Math::min)
                .orElse(0);
    }

    // {"a", "b", "c", "d"}
    public String reduceUpperGlue(String[] elems) {
        return Arrays
                .stream(elems)
                .reduce("", (a, b) -> a.toUpperCase() + b.toUpperCase());
    }

    public int reduceCount(List<List<String>> lists) {
        return lists
                .stream()
                .map(Collection::size)
                .reduce(0, Integer::sum);
    }
}
