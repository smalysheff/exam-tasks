package ru.smal.common.core.stream_api.convert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ConvertArrayToList {

    public List<Integer> convertUseStream(int[] nums) {
        return Arrays.stream(nums).boxed().toList();
    }

    public List<Integer> convertUseIntStream(int[] nums) {
        Stream.of(1, 2, 3).toList();
        return IntStream.of(nums).boxed().toList();
    }

    public List<Integer> convertUseForLoop(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return list;
    }

    public List<Integer> convertUseWhileLoop(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < nums.length) {
            list.add(nums[i++]);
        }
        return list;
    }
}
