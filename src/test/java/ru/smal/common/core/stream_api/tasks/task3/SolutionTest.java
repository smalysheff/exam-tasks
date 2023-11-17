package ru.smal.common.core.stream_api.tasks.task3;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void findAverageMarkStudentBySubjectsTest() {
        Map<String, Double> actual = solution.findAverageMarkStudentBySubjects(buildStudents());
        Map<String, Double> expected = Map.of("Stepan", 4.5d, "Ivan", 3.0d);

        Assertions.assertEquals(expected, actual);
    }

    private List<Student> buildStudents() {
        Student student1 = new Student("Ivan", Map.of(
                "Математика", List.of(2, 2, 4, 4)
        ));

        Student student2 = new Student("Stepan", Map.of(
                "Русский язык", List.of(5, 5, 4, 4)
        ));

        return List.of(student1, student2);
    }
}