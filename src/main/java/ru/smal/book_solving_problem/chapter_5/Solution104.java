package ru.smal.book_solving_problem.chapter_5;


import java.util.stream.IntStream;

/**
 * Минимальное, максимальное и среднее значения массива.
 * Написать программу, которая вычисляет минимальное, максимальное и среднее значения
 * заданного массива.
 */
public class Solution104 {

    public int maxElementV1(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }

    public int maxElementV2(int[] nums) {
        int max = nums[0];
        for(int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public int maxElementV3(int[] nums) {
        return IntStream.of(nums)
                .summaryStatistics()
                .getMax();
    }

    public int maxElementV4(int[] nums) {
        return IntStream.of(nums)
                .max()
                .getAsInt();
    }

    public int maxElementV5(int[] nums) {
        return IntStream.of(nums)
                .reduce(Math::max)
                .getAsInt();
    }
}
