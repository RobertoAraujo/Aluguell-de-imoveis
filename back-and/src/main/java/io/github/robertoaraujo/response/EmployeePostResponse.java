package io.github.robertoaraujo.response;

import io.github.robertoaraujo.model.Address;
import io.github.robertoaraujo.model.Phone;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmployeePostResponse {
    private Long id;
    private String name;
    private String lastName;
    private Address address;
    private List<Phone> phones;
}
