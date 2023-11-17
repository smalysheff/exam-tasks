package ru.smal.common.core.stream_api.tasks;


import java.util.stream.IntStream;

/**
 * 1. Определение количества четных/нечетных чисел в потоке данных.
 */
public class Solution1 {

    // Array parameter
    public long even(int[] nums) {
        return IntStream
                .of(nums)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public long odd(int[] nums) {
        return IntStream
                .of(nums)
                .filter(n -> n % 2 == 1)
                .count();
    }

    public long evenUsingForLoop(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    public long oddUsingForLoop(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if (n % 2 == 1) {
                count++;
            }
        }
        return count;
    }

    // Digital parameter

    public long even(int upperBoundRange) {
        return IntStream
                .range(0, upperBoundRange)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public long evenIterateLimit(int upperBoundRange) {
        return IntStream
                .iterate(0, i -> i + 1)
                .limit(upperBoundRange)
                .filter(n -> n % 2 == 0)
                .count();
    }

    public long odd(int upperBoundRange) {
        return IntStream
                .range(0, upperBoundRange)
                .filter(n -> n % 2 == 1)
                .count();
    }
}
