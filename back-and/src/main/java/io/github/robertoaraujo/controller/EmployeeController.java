package io.github.robertoaraujo.controller;

import io.github.robertoaraujo.response.EmployeeGetResponse;
import io.github.robertoaraujo.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("v1/funcionarios")
@RestController
@RequiredArgsConstructor
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @GetMapping
    public ResponseEntity<List<EmployeeGetResponse>> findAll(@RequestParam(required = false) String firstName) {
        List<EmployeeGetResponse> response = service.findAll(firstName);
        return ResponseEntity.ok(response);
    }


}
