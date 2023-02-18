package ru.smal.easy.easy977;

import java.util.*;
import java.util.stream.IntStream;

/**
 * 977. Squares of a Sorted Array
 * Given an integer array items sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * <p>
 * Example 1:
 * Input: items = [-4,-1,0,3,10]
 * Output: [0,1,9,16,100]
 * Explanation: After squaring, the array becomes [16,1,0,9,100].
 * After sorting, it becomes [0,1,9,16,100].
 * <p>
 * Example 2:
 * Input: items = [-7,-3,2,3,11]
 * Output: [4,9,9,49,121]
 */
public class Solution {

    public int[] sortedSquaresStream(int[] items) {
        return IntStream.of(items)
                .map(n -> n * n)
                .sorted()
                .toArray();
    }

    public int[] sortedSquaresPriorityQueue(int[] items) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.comparingInt(n -> n));

        //Добавляем в очередь с приоритетом, но если очередь вернуть в качестве результата,
        // порядок не гарантирован, необходимо вычитать из очереди значения в результирующую структуру.
        for (int num : items) {
            queue.add(num * num);
        }

        // Вычитка из очереди гарантирует порядок.
        int[] result = new int[items.length];
        for (int i = 0; !queue.isEmpty(); i++) {
            result[i] = queue.poll();
        }

        return result;
    }

    public int[] sortedSquaresDeque(int[] items) {
        int left = 0;
        int right = items.length - 1;

        Deque<Integer> queue = new ArrayDeque<>();

        while (left <= right) {
            int leftValue = items[left] * items[left];
            int rightValue = items[right] * items[right];

            if (leftValue < rightValue) {
                queue.addFirst(rightValue);
                right--;
            } else {
                queue.addFirst(leftValue);
                left++;
            }
        }

        return queue.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] sortedSquaresLinkedList(int[] items) {
        int left = 0;
        int right = items.length - 1;

        LinkedList<Integer> list = new LinkedList<>();
        while (left <= right) {
            int leftValue = items[left] * items[left];
            int rightValue = items[right] * items[right];

            if (leftValue < rightValue) {
                list.addFirst(rightValue);
                right--;
            } else {
                list.addFirst(leftValue);
                left++;
            }
        }

        return list.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public int[] sortedSquaresArray(int[] items) {
        int left = 0;
        int right = items.length - 1;
        int index = items.length - 1;

        int[] result = new int[items.length];
        while (left <= right) {
            int leftValue = items[left] * items[left];
            int rightValue = items[right] * items[right];

            if (leftValue < rightValue) {
                result[index] = rightValue;
                right--;
                index--;
            } else {
                result[index] = leftValue;
                left++;
                index--;
            }
        }

        return result;
    }
}
