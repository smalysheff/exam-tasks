package ru.smal.book_solving_problem.chapter_5;

import java.util.Comparator;

/**
 * Написать программу, которая имплементирует структуру данных —
 * кортеж.
 */
public class Solution125 {

    public <T> Pair<T, T> minMaxArray(T[] array, Comparator<? super T> comparator) {
        T min = array[0];
        T max = array[0];


        for (T elem : array) {
            if (comparator.compare(min, elem) > 0) {
                min = elem;
            } else if (comparator.compare(max, elem) < 0) {
                max = elem;
            }
        }

        return Pair.of(min, max);
    }

    public static class Pair<L, R> {

        private L left;
        private R right;

        private Pair(L left, R right) {
            this.left = left;
            this.right = right;
        }

        public static <L, R> Pair<L, R> of(L left, R right) {
            return new Pair<>(left, right);
        }

        public L getLeft() {
            return left;
        }

        public R getRight() {
            return right;
        }
    }
}
