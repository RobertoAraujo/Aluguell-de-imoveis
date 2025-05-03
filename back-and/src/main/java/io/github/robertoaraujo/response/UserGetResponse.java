package io.github.robertoaraujo.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class UserGetResponse {

    private String nome;
    private String lastName;
    private AddressGetResponse address;
    private List<PhoneGetResponse> phones;
}
