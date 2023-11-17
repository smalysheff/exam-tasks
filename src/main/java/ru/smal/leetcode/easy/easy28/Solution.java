package ru.smal.leetcode.easy.easy28;

/**
 * Given two strings needle and haystack, return the index of the first
 * occurrence of needle in haystack, or -1 if needle is not part of haystack.
 * <p>
 * Example 1:
 * Input: haystack = "sadbutsad", needle = "sad"
 * Output: 0
 * Explanation: "sad" occurs at index 0 and 6.
 * The first occurrence is at index 0, so we return 0.
 * <p>
 * Example 2:
 * Input: haystack = "leetcode", needle = "leeto"
 * Output: -1
 * Explanation: "leeto" did not occur in "leetcode", so we return -1.
 * <p>
 * Constraints:
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */
public class Solution {

    public int containsStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public int containsStrV2(String haystack, String needle) {
        int needleLen = needle.length();
        int haystackLen = haystack.length();
        if (needleLen == haystackLen && haystack.equals(needle)) {
            return 0;
        }
        for (int i = 0; i < haystackLen; i++) {
            int lastIndex = i + needleLen;
            if (lastIndex < haystackLen && haystack.substring(i, lastIndex).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
}
