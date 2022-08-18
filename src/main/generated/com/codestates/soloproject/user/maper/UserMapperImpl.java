package com.codestates.soloproject.user.maper;

import com.codestates.soloproject.user.dto.UserDto;
import com.codestates.soloproject.user.entity.User;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2022-08-18T23:52:49+0900",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 11.0.15 (Azul Systems, Inc.)"
)
@Component
public class UserMapperImpl implements UserMapper {

    @Override
    public User userPostToUser(UserDto.Post requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        User user = new User();

        user.setEmail( requestBody.getEmail() );
        user.setName( requestBody.getName() );
        user.setRegion( requestBody.getRegion() );
        user.setSector( requestBody.getSector() );

        return user;
    }

    @Override
    public User userPatchToUser(UserDto.Patch requestBody) {
        if ( requestBody == null ) {
            return null;
        }

        User user = new User();

        user.setUserId( requestBody.getUserId() );
        user.setName( requestBody.getName() );
        user.setRegion( requestBody.getRegion() );
        user.setSector( requestBody.getSector() );

        return user;
    }

    @Override
    public UserDto.Response userToUserResponse(User user) {
        if ( user == null ) {
            return null;
        }

        long userId = 0L;
        String email = null;
        String name = null;

        userId = user.getUserId();
        email = user.getEmail();
        name = user.getName();

        UserDto.Response response = new UserDto.Response( userId, email, name );

        return response;
    }
}
