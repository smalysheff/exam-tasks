package ru.smal.book_solving_problem.chapter_5;

import java.util.List;

/**
 * Замена элементов в списке
 * <p>
 * Допустим, что мы хотим заменить все дыни весом менее 3000 г другими дынями
 * того же сорта, которые весят 3000 г
 */
public class Solution121 {

    /**
     * for loop
     *
     * @return modified list
     */
    public List<Melon> replaceElementsV1(List<Melon> source) {
        for (int i = 0; i < source.size(); i++) {
            Melon melon = source.get(i);
            if (melon.weight() < 3000) {
                source.set(i, new Melon(melon.type(), 3000));
            }
        }
        return source;
    }


    /**
     * while loop
     * @return modified list
     */
    public List<Melon> replaceElementsV2(List<Melon> source) {
        int index = 0;
        while (index < source.size()) {
            Melon melon = source.get(index);
            if (melon.weight() < 3000) {
                source.set(index, new Melon(melon.type(), 3000));
            }
            index++;
        }
        return source;
    }

    /**
     * replaceAll
     *
     * @return modified list
     */
    public List<Melon> replaceElementsV3(List<Melon> source) {
        source.replaceAll(m -> m.weight() < 3000 ? new Melon(m.type(), 3000) : m);
        return source;
    }
}
