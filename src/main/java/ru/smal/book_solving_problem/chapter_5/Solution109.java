package ru.smal.book_solving_problem.chapter_5;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 109. Создание
 * немодифицируемых/немутируемых коллекций
 */
public class Solution109 {

    public void createUnmodifiableCollections1() {
        // Немодифицируемые коллекции UnsupportedOperationException
        // Мутируемый класс

        // Replace with List.of()
        List<MutableMelon> melons1 = Collections.unmodifiableList(Arrays.asList(
                new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200)
        ));
        // Предпочтительный вариант
        List<MutableMelon> melons2 = List.of(
                new MutableMelon("Crenshaw", 2000),
                new MutableMelon("Gac", 1200)
        );
    }

    public List<ImmutableMelon> createUnmodifiableCollections2() {
        // Немодифицируемые коллекции UnsupportedOperationException
        // Немутируемый класс

        List<ImmutableMelon> melons = List.of(
                new ImmutableMelon("Crenshaw", 2000),
                new ImmutableMelon("Gac", 1200)
        );

        return melons;
    }
}



@Getter
@Setter
@AllArgsConstructor
class MutableMelon {
    private String type;
    private int weight;
}

record ImmutableMelon(String type, int weight) {
}
