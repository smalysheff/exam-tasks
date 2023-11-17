package ru.smal.leetcode.medium.medium49;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Solution {

    /**
     * ["eat","tea","tan","ate","nat","bat"]
     * sort
     * aet -> [eat, tea, ate,]
     * abt -> [bat]
     * ant -> [tan, nat]
     */
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length == 0) return List.of(Stream.of(strs).toList());

        Map<String, List<String>> keyAnagramGroupMap = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            keyAnagramGroupMap
                    .computeIfAbsent(String.valueOf(chars), k -> new ArrayList<>())
                    .add(str);
        }

        return new ArrayList<>(keyAnagramGroupMap.values());
    }
}
