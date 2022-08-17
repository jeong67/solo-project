package com.codestates.soloproject.user.dto;

import lombok.Getter;

import javax.validation.constraints.NotBlank;

@Getter
public class UserPatchDto {
    private long userId;

    @NotBlank(message = "이름은 공백이 아니어야 합니다")
    private String name;

    @NotBlank(message = "지역은 공백이 아니어야 합니다.")
    private String region;

    @NotBlank(message = "업종은 공백이 아니어야 합니다.")
    private String sector;
}
