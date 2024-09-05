package ru.smal.simple_test.for_hotkey;

public class Person {

    private String name;
    private Progress progress;

    public Person(String name, Progress progress) {
        this.name = name;
        this.progress = progress;
    }

    public Progress getProgress() {
        return progress;
    }

    public static void main(String[] args) {
        Person person = new Person("John", new Progress(new Rating("100")));
        person.getProgress().getRating();
    }
}
