package ru.smal.easy.easy448;

import java.util.ArrayList;
import java.util.List;

/**
 * 448. Find All Numbers Disappeared in an Array
 * Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range [1, n] that do not appear in nums.
 * <p>
 * Example 1:
 * Input: nums = [4,3,2,7,8,2,3,1]
 * Output: [5,6]
 * <p>
 * Example 2:
 * Input: nums = [1,1]
 * Output: [2]
 * <p>
 * Constraints:
 * n == nums.length
 * 1 <= n <= 105
 * 1 <= nums[i] <= n
 */
public class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int pos = nums[i] - 1; // correct position
            if (nums[i] != nums[pos]) {
                swap(nums, i, pos);
            } else {
                i++;
            }
        }

        List<Integer> result = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                result.add(j + 1);
            }
        }

        return result;
    }

    private void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }
}
