package ru.smal.gof_patterns.creational.builder;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * A mutable object using a call chain setters
 */
@Getter
@Setter
@NoArgsConstructor
@Accessors(chain = true)
public class EmployeeAccessor {

    private String firstName;
    private String lastName;
    private String address;
    private String phone;
    private String email;
}
