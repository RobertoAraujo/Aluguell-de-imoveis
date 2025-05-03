package io.github.robertoaraujo.service;

import io.github.robertoaraujo.mapper.UserMapper;
import io.github.robertoaraujo.model.User;
import io.github.robertoaraujo.repository.UserRepository;
import io.github.robertoaraujo.response.UserGetResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository repository;

    @Autowired
    private UserMapper mapper;

    public List<UserGetResponse> findAll(String firstName) {
        List<User> response = firstName == null ? repository.findAll() : repository.findByNameContaining(firstName);

        return mapper.toEmployeeGetResponseList(response);
    }
}
