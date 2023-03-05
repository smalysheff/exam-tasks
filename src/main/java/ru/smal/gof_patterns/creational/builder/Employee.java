package ru.smal.gof_patterns.creational.builder;

import lombok.Getter;

@Getter
public class Employee {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phone;
    private final String email;

    private Employee(EmployeeBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.phone = builder.phone;
        this.email = builder.email;
    }

    public static class EmployeeBuilder {

        private String firstName;
        private String lastName;
        private String address;
        private String phone;
        private String email;

        public EmployeeBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public EmployeeBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public EmployeeBuilder address(String address) {
            this.address = address;
            return this;
        }

        public EmployeeBuilder phone(String phone) {
            this.phone = phone;
            return this;
        }

        public EmployeeBuilder email(String email) {
            this.email = email;
            return this;
        }

        public Employee build() {
            return new Employee(this);
        }
    }
}
