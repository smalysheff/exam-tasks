package ru.smal.common.sorting_algorithm;

/**
 * Circle sort algorithm
 */
public class CircleSort {

    public int[] circleSort(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1; //correct position
            if (nums[i] != nums[pos]) {
                swap(nums, i, pos);
            } else {
                i++;
            }
        }
        return nums;
    }

    private void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
