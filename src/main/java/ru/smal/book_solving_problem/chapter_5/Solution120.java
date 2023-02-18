package ru.smal.book_solving_problem.chapter_5;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Фильтрация коллекции по списку
 */
public class Solution120 {

    public List<Melon> containsItems(List<Melon> melons, List<String> melonTypes) {
        return melons.stream()
                .filter(m -> melonTypes.contains(m.type()))
                .toList();
    }

    // Преобразуем в -> HashSet --> Опримальнее т.к. константный доступ по ключу
    public List<Melon> containsItemsWithHashSet(List<Melon> melons, List<String> melonTypes) {
        Set<String> types = new HashSet<>(melonTypes);
        return melons.stream()
                .filter(m -> types.contains(m.type()))
                .toList();
    }
}

record Melon(String type, int weight) {
}
