package io.github.robertoaraujo.mapper;


import io.github.robertoaraujo.model.Employee;
import io.github.robertoaraujo.response.EmployeeGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Primary
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface EmployeeMapper {
    EmployeeGetResponse toEmployeeGetResponse(Employee employee);

    List<EmployeeGetResponse> toEmployeeGetResponseList(List<Employee> employeeList);

}