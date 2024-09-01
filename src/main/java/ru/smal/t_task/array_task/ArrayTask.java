package ru.smal.t_task.array_task;

import java.util.stream.IntStream;

public class ArrayTask {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5};
        int[] arr2 = {3, 3, 4};
        int[] arr3 = {2, 3, 4, 5, 6};

        int presentNumber = getRepeatableNumber(arr1, arr2, arr3);

        System.out.println(presentNumber);
    }

    public static int getRepeatableNumber(int[] a, int[] b, int[] c) {
        return IntStream.of(a)
                .filter(num -> contains(b, num) && contains(c, num))
                .findFirst()
                .orElse(-1);
    }

    private static boolean contains(int[] array, int num) {
        return IntStream.of(array).anyMatch(n -> n == num);
    }
}
