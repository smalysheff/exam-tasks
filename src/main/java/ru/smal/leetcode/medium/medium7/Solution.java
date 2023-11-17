package ru.smal.leetcode.medium.medium7;

public class Solution {

    public int reverse(int num) {
        if (num == 0) {
            return 0;
        }

        long result = 0;
        while (num != 0) {
            result = (result + num % 10) * 10;
            num /= 10;
        }

        result /= 10;
        if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
            return 0;
        }

        return (int) result;
    }
}
