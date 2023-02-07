package ru.smal.easy.easy69;


/**
 * 69. Sqrt(x)
 * <p>
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 * <p>
 * You must not use any built-in exponent function or operator.
 * <p>
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * <p>
 * Example 1:
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * <p>
 * Example 2:
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 * <p>
 * Constraints:
 * 0 <= x <= 231 - 1
 */
public class Solution {
    public int mySqrtWhileLoop(int x) {
        if (x == 0 || x == 1) {
            return x;
        }

        int start = 1;
        int end = x / 2;
        int result = 0;

        while (start <= end) {
            int mid = (start + end) / 2;

            int item = x / mid;

            if (item == mid) {
                return mid;
            }

            if (item < mid) {
                end = mid - 1;
            } else {
                start = mid + 1;
                result = mid;
            }
        }
        return result;
    }
}
