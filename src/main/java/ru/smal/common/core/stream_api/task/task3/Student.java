package ru.smal.common.core.stream_api.task.task3;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@Getter
@AllArgsConstructor
class Student {
    private String name;
    private Map<String, List<Integer>> marks;
}
