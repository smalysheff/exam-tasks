package ru.smal.simple_test.lombok_mupstruct;

import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {
    EmployeeDto employeeToEmployeeDto(Employee employee);

    Employee employeeDtoToEmployee(EmployeeDto employeeDto);
}
