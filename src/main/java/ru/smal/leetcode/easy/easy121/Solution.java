package ru.smal.leetcode.easy.easy121;

public class Solution {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for (int price : prices) {
            if (price < min) {
                min = price;
            } else if (price - min > maxProfit) {
                maxProfit = price - min;
            }
        }
        return maxProfit;
    }
}
