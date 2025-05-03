package io.github.robertoaraujo.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class AddressGetResponse {
    private String street;
    private String district;
    private String city;
    private String state;
    private String number;
    private String zipCode;
    private String complement;

}
