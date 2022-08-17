package com.codestates.soloproject.user.dto;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserResponseDto {
    private long userId;
    private String name;
    private String email;
    private String region;
    private String sector;
}
