package ru.smal.leetcode.easy.easy67;

/**
 * Given two binary strings a and b, return their sum as a binary string.
 * <p>
 * Example 1:
 * Input: a = "11", b = "1"
 * Output: "100"
 * <p>
 * Example 2:
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 */
public class Solution {

    public String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int carry = 0;
        int i = a.length() - 1;
        int j = b.length() - 1;

        while (i >= 0 || j >= 0 || carry != 0) {
            int digitA = i >= 0 ? a.charAt(i) - '0' : 0;
            int digitB = j >= 0 ? b.charAt(j) - '0' : 0;
            int currentSum = digitA + digitB + carry;

            result.insert(0, currentSum % 2);
            carry = currentSum / 2;

            i--;
            j--;
        }

        return result.toString();
    }

    public String toBinary(String decNum) {
        int decimal = Integer.parseInt(decNum);
        if (decimal == 0 || decimal == 1) {
            return String.valueOf(decimal);
        }
        StringBuilder result = new StringBuilder();
        while (decimal > 0) {
            result.insert(0, decimal % 2);
            decimal /= 2;
        }

        return result.toString();
    }
}
