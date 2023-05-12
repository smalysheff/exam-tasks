package ru.smal.common.core.stream_api.task.task3;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * * class Student3_1 {
 * //1.Дан массив студентов с оценками по предметам. Найти (необходимо получить Map):
 * //•    Найти среднее каждого студента по предметам;
 * //•    Найти среднее по предмету среди всех студентов;
 * //•    Найти среднее среди всех студентов по всем предметам (общее среднее);
 * //•    Посчитать «оценку» студента, исходя из его общего количества баллов: 0-7 – bad, 8-15 – normal, 16+ - good.
 * //•    Получить String – название самого легкого предмета среди студентов.
 * //•    Получить String – самого умного студента.
 * String name;
 * Map<String, List<Integer>> marks;
 * public Student3_1(String name, Map<String, List<Integer>> marks) {
 * this.name = name;
 * this.marks = marks;
 * }
 * }
 */
public class Solution {

    public Map<String, Double> findAverageMarkStudentBySubjects(List<Student> students) {
       return students
               .stream()
               .collect(Collectors.toMap(Student::getName, this::getCommonAvgMark));
    }

    private Double getCommonAvgMark(Student student) {
        return student
                .getMarks()
                .values()
                .stream()
                .flatMap(Collection::stream)
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);
    }


    public Map<String, Double> findAverageMarkSubjectByStudents(List<Student> students) {
        return Collections.emptyMap();
    }

    public Double findFullAverageMark(List<Student> students) {
        return null;
    }
}


