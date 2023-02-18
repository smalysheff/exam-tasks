package ru.smal.common.core.stream_api.task;


import java.util.stream.IntStream;

/**
 * 1. Определение количества четных/нечетных чисел в потоке данных.
 */
public class Solution1 {

    public int even(int[] nums) {
        return (int) IntStream
                .of(nums)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public int odd(int[] nums) {
        return (int) IntStream
                .of(nums)
                .filter(n -> n % 2 == 1)
                .count();
    }
}
