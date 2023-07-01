package ru.smal;

import lombok.ToString;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
//        List<Integer> nums = List.of(1, 2, 3);
//
//        nums.set(1, 4);
//
//        System.out.println(nums);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<Integer> unmodifiableList = Collections.unmodifiableList(numbers);

        System.out.println(unmodifiableList);

        numbers.set(1, 4);

        System.out.println(unmodifiableList);

    }
}

@ToString
//@Getter
//@AllArgsConstructor
class Person {

    private final String name;
    private final int age;
    private final List<String> hobbies;

    public Person(String name, int age, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.hobbies = new ArrayList<>(hobbies);
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);
    }

}


