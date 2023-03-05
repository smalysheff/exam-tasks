package ru.smal.gof_patterns.creational.builder;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class EmployeeAccessorTest {

    public static final String FIRST_NAME = "first_name";
    public static final String LAST_NAME = "last_name";
    public static final String ADDRESS = "address";
    public static final String PHONE = "phone";
    public static final String EMAIL = "email";

    @Test
    void initEmployeeTest() {
        EmployeeAccessor employee = createEmployeeAccessor();

        Assertions.assertThat(employee.getFirstName()).isEqualTo(FIRST_NAME);
        Assertions.assertThat(employee.getLastName()).isEqualTo(LAST_NAME);
        Assertions.assertThat(employee.getAddress()).isEqualTo(ADDRESS);
        Assertions.assertThat(employee.getPhone()).isEqualTo(PHONE);
        Assertions.assertThat(employee.getEmail()).isEqualTo(EMAIL);
    }

    private EmployeeAccessor createEmployeeAccessor() {
        return new EmployeeAccessor()
                .setFirstName(FIRST_NAME)
                .setLastName(LAST_NAME)
                .setAddress(ADDRESS)
                .setPhone(PHONE)
                .setEmail(EMAIL);
    }
}