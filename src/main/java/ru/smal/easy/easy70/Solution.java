package ru.smal.easy.easy70;

/**
 * 70. Climbing Stairs
 * <p>
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * <p>
 * Example 1:
 * Input: n = 2
 * Output: 2
 * Explanation: There are two ways to climb to the top.
 * 1. 1 step + 1 step
 * 2. 2 steps
 * <p>
 * Example 2:
 * Input: n = 3
 * Output: 3
 * Explanation: There are three ways to climb to the top.
 * 1. 1 step + 1 step + 1 step
 * 2. 1 step + 2 steps
 * 3. 2 steps + 1 step
 * <p>
 * Constraints:
 * <p>
 * 1 <= n <= 45
 */
public class Solution {
    public int climbStairsRecursion(int n) {
        if (n == 1 || n == 2) return n;
        return climbStairsRecursion(n - 2) + climbStairsRecursion(n - 1);
    }

    public int climbStairsForLoop(int n) {
        if (n <= 2) return n;

        int oneStep = 1;
        int twoStep = 2;
        int tmp = 0;

        for (int i = 3; i < n + 1; i++) {
            tmp = twoStep;
            twoStep += oneStep;
            oneStep = tmp;
        }
        return twoStep;
    }

}

/*
 * 1 1 1 1
 *
 * 2 2
 *
 * 2 1 1
 * 1 2 1
 * 1 1 2
 ************
 *
 * 1 1 1 1 1
 *
 * 1 1 1 2
 * 1 1 2 1
 * 1 2 1 1
 * 2 1 1 1
 *
 * 2 2 1
 * 2 1 2
 * 1 2 2
 */
