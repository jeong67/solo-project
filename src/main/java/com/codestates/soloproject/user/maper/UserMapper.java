package com.codestates.soloproject.user.maper;
import com.codestates.soloproject.user.dto.UserDto;
import com.codestates.soloproject.user.entity.User;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User userPostToUser(UserDto.Post requestBody);
    User userPatchToUser(UserDto.Patch requestBody);
    UserDto.Response userToUserResponse(User user);
    List<UserDto.Response> userToUserResponse(List<User> users);

}
