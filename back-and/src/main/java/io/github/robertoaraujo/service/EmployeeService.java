package io.github.robertoaraujo.service;

import io.github.robertoaraujo.mapper.EmployeeMapper;
import io.github.robertoaraujo.model.Employee;
import io.github.robertoaraujo.repository.EmployeeRepository;
import io.github.robertoaraujo.response.EmployeeGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    @Autowired
    private EmployeeMapper mapper;

    public List<EmployeeGetResponse> findAll(String firstName) {
        List<Employee> response = firstName == null ? repository.findAll() : repository.findByNameContaining(firstName);

        return mapper.toEmployeeGetResponseList(response);
    }
}