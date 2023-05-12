package ru.smal.leetcode.medium.medium_151;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


/**
 * Given an input string s, reverse the order of the words.
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * <p>
 * Return a string of the words in reverse order concatenated by a single space.
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * <p>
 * Example 1:
 * Input: s = "the sky is blue"
 * Output: "blue is sky the"
 * <p>
 * Example 2:
 * Input: s = "  hello world  "
 * Output: "world hello"
 * Explanation: Your reversed string should not contain leading or trailing spaces.
 * <p>
 * Example 3:
 * Input: s = "a good   example"
 * Output: "example good a"
 * Explanation: You need to reduce multiple spaces between two words to a single space in the reversed string.
 */
public class Solution {

    public String reverseWordsUseForLoopList(String s) {
        String[] words = s.split("\\s+");

        List<String> result = new ArrayList<>();
        for (int i = words.length - 1; i >= 0; i--) {
            result.add(words[i]);
        }
        return String.join(" ", result).trim();
    }

    public String reverseWordsUseForLoopList1(String s) {
        List<String> words = Arrays.asList(s.split("\\s+"));
        Collections.reverse(words);
        return String.join(" ", words).trim();
    }

    public String reverseWordsUseStringBuilder(String s) {
        String[] words = s.split("\\s+");

        StringBuilder result = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            result.append(words[i]).append(" ");
        }
        return result.toString().trim();
    }
}
