package ru.smal.book_solving_problem.chapter_5;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.IntStream;

/**
 * Инвертирование массива.
 * Написать программу, которая инвертирует заданный массив
 */
public class Solution105 {

    public int[] reverseV1(int[] nums) {
        for (int i = 0; i < nums.length / 2; i++) {
            swap(nums, i);
        }
        return nums;
    }

    private void swap(int[] nums, int i) {
        int tail = nums.length - 1 - i;
        int temp = nums[i];
        nums[i] = nums[tail];
        nums[tail] = temp;
    }

    public int[] reverseV2(int[] nums) {
        return IntStream
                .rangeClosed(1, nums.length)
                .map(i -> nums[nums.length - i])
                .toArray();
    }
}
