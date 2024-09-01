package ru.smal.simple_test.lombok_mupstruct;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Employee {

    private int id;
    private String name;
}
