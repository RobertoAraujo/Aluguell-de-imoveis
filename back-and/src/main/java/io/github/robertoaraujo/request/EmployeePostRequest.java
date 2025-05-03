package io.github.robertoaraujo.request;

import io.github.robertoaraujo.model.Address;
import io.github.robertoaraujo.model.Phone;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class EmployeePostRequest {
    @NotBlank(message = "O campo nome é obrigatório")
    private String name;
    @NotBlank(message = "O campo sobrenome é obrigatório")
    private String lastName;
    @NotNull(message = "O campo categoria é obrigatório")
    private Long categoryId;
    private Address address;
    private List<Phone> phones;
}
