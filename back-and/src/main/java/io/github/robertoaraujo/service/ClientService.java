package io.github.robertoaraujo.service;

import io.github.robertoaraujo.mapper.ClientMapper;
import io.github.robertoaraujo.model.Client;
import io.github.robertoaraujo.repository.ClientRepository;
import io.github.robertoaraujo.response.ClientGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientService {

    @Autowired
    private ClientRepository repository;
    @Autowired
    private ClientMapper mapper;
    @Autowired
    private AddressService addressService;

    public List<ClientGetResponse> findAll(String firstName) {
        List<Client> response = firstName == null ? repository.findAll() : repository.findAllByNameContaining(firstName);
        return mapper.toClientGetResponseList(response);
    }
}

