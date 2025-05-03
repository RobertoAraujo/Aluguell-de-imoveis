package io.github.robertoaraujo.controller;

import io.github.robertoaraujo.response.ClientGetResponse;
import io.github.robertoaraujo.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/clients")
@RequiredArgsConstructor
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping
    public ResponseEntity<List<ClientGetResponse>> findAll(@RequestParam(required = false) String firstName) {
        List<ClientGetResponse> response = service.findAll(firstName);
        return ResponseEntity.ok(response);
    }

}
