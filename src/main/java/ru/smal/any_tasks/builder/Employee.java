package ru.smal.any_tasks.builder;

public class Employee {

    private final String name;
    private final String age;

    private Employee(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String name;
        private String age;

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(String age) {
            this.age = age;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
