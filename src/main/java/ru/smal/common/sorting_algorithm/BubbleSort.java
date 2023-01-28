package ru.smal.common.sorting_algorithm;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BubbleSort {

    public int[] bubbleSortWhileLoop(int[] arr) {
        boolean stop;
        int count = 0;
        do {
            stop = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    stop = true;
                    swap(arr, i, i + 1);
                }
                count++;
            }
        } while (stop);

        log.info("Количество циклов: [{}]", count);
        return arr;
    }

    public int[] bubbleSortForLoop(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                }
                count++;
            }
        }

        log.info("Количество циклов: [{}]", count);
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
