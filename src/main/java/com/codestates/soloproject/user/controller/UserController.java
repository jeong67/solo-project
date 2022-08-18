package com.codestates.soloproject.user.controller;

import com.codestates.soloproject.user.dto.UserDto;
import com.codestates.soloproject.user.entity.User;
import com.codestates.soloproject.user.maper.UserMapper;
import com.codestates.soloproject.user.service.UserService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.Positive;
import java.util.List;

@Validated
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    private final UserMapper mapper;

    public UserController(UserService userService, UserMapper mapper) {
        this.userService = userService;
        this.mapper=mapper;
    }

    @PostMapping
    public ResponseEntity postUser(@Valid @RequestBody UserDto.Post requestBody) {
        User user = mapper.userPostToUser(requestBody);

        User createdUser = userService.createUser(user);

        return new ResponseEntity<>(mapper.userToUserResponse(createdUser), HttpStatus.CREATED);
    }

    @PatchMapping("/{user-id}")
    public ResponseEntity patchUser(@PathVariable("user-id") @Positive long userId, @Valid @RequestBody UserDto.Patch requestBody) {
        requestBody.setUserId(userId);

        User user = userService.updateUser(mapper.userPatchToUser(requestBody));

        return new ResponseEntity<>(mapper.userToUserResponse(user), HttpStatus.OK);
    }

    @GetMapping("/{user-id}")
    public ResponseEntity getUser(@PathVariable("user-id") @Positive long userId) {
        User user = userService.findUser(userId);
        return new ResponseEntity<>(mapper.userToUserResponse(user), HttpStatus.OK);
    }

//    @GetMapping
//    public ResponseEntity getUsers(@Positive @RequestParam int page, @Positive @RequestParam int size) {
//        Page<User> pageUsers = userService.findUsers(page -1, size);
//        List<User> users = pageUsers.getContent();
//
//        return new ResponseEntity(mapper.userToUserResponse(users),HttpStatus.OK);
//
//    }

}
