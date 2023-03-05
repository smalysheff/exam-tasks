package ru.smal.gof_patterns.creational.builder;

import lombok.Builder;
import lombok.Getter;


/**
 * A immutable object
 */
@Getter
@Builder
public class EmployeeLombok {

    private final String firstName;
    private final String lastName;
    private final String address;
    private final String phone;
    private final String email;
}
