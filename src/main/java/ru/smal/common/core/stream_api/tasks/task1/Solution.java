package ru.smal.common.core.stream_api.tasks.task1;

import java.util.List;

/**
 *  Задано множество фамилий сотрудников. Разработать программу,
 *  которая отображает все фамилии, начинающиеся на букву «J».
 */
public class Solution {

    public List<String> findSurnameByFirstChar(List<String> surnames, char firstChar) {
        return surnames
                .stream()
                .filter(s -> s.charAt(0) == firstChar)
                .toList();
    }
}
