package io.github.robertoaraujo.response;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientPostResponse {
    private String name;
    private String lastName;
}
