package ru.smal.common.circle_sort;

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

// [4, 3, 5, 2, 1]