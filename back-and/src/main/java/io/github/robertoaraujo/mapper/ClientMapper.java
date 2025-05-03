package io.github.robertoaraujo.mapper;

import io.github.robertoaraujo.model.Client;
import io.github.robertoaraujo.response.ClientGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Primary
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ClientMapper {
    ClientGetResponse toClientGetResponse(Client client);
    List<ClientGetResponse> toClientGetResponseList(List<Client> clientList);

}
