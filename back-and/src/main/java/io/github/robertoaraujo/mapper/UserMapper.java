package io.github.robertoaraujo.mapper;

import io.github.robertoaraujo.model.User;
import io.github.robertoaraujo.response.UserGetResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Primary
@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    UserGetResponse toUserGetResponse(User user);

    List<UserGetResponse> toEmployeeGetResponseList(List<User> userList);

}
