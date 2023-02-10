package ru.smal.common.sorting_algorithm;

public class BubbleSort {

    public int[] bubbleSortDoWhileLoop(int[] nums) {
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swapped = true;
                    swap(nums, i, i + 1);
                }
            }
        } while (swapped);

        return nums;
    }

    public int[] bubbleSortWhileLoop(int[] nums) {
        boolean swapped = true;

        while (swapped) {
            swapped = false;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    swap(nums, i, i + 1);
                    swapped = true;
                }
            }
        }

        return nums;
    }

    public int[] bubbleSortForLoop(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[i] > nums[j + 1]) {
                    swap(nums, i, j + 1);
                }
            }
        }

        return nums;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
