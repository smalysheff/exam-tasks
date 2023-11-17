package ru.smal.leetcode.easy.easy125;

import java.util.stream.IntStream;

/**
 * A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all
 * non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * <p>
 * Given a string s, return true if it is a palindrome, or false otherwise.
 * <p>
 * Example 1:
 * Input: s = "A man, a plan, a canal: Panama"
 * Output: true
 * Explanation: "amanaplanacanalpanama" is a palindrome.
 * <p>
 * Example 2:
 * Input: s = "race a car"
 * Output: false
 * Explanation: "raceacar" is not a palindrome.
 * <p>
 * Example 3:
 * Input: s = " "
 * Output: true
 * Explanation: s is an empty string "" after removing non-alphanumeric characters.
 * Since an empty string reads the same forward and backward, it is a palindrome.
 */
public class Solution {

    public boolean isPalindrome(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]+", "");
        System.out.println(result);
        return new StringBuilder(result)
                .reverse().toString()
                .equalsIgnoreCase(result);
    }

    public boolean isPalindromeTwoPointer(String s) {
        String result = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();

        int left = 0;
        int right = result.length() - 1;
        while (left < right) {
            if (result.charAt(left) != result.charAt(right)) {
                return false;
            }
            left ++;
            right--;
        }
        return true;
    }

    public boolean isPalindromeStreamApi(String s) {
        String res = s.replaceAll("[^a-zA-Z0-9]+", "").toLowerCase();
        return IntStream.range(0, res.length() / 2)
                .allMatch(i -> res.charAt(i) == res.charAt(res.length() - i - 1));
    }
}
