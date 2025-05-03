package io.github.robertoaraujo.controller;

import io.github.robertoaraujo.response.UserGetResponse;
import io.github.robertoaraujo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("v1/usuarios")
@RestController
@RequiredArgsConstructor
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping
    public ResponseEntity<List<UserGetResponse>> findAll(@RequestParam(required = false) String firstName) {
        List<UserGetResponse> response = service.findAll(firstName);
        return ResponseEntity.ok(response);
    }
}
