package com.codestates.soloproject.user.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public class UserDto {
    @Getter
    public static class Post {
        @NotBlank(message = "이메일은 공백이 아니어야 합니다.")
        @Email
        private String email;

        @NotBlank(message = "이름은 공백이 아니어야 합니다.")
        private String name;

        @NotBlank(message = "지역은 공백이 아니어야 합니다.")
        private String region;

        @NotBlank(message = "업종은 공백이 아니어야 합니다.")
        private String sector;
    }

    @Getter
    public static class Patch {
        private long userId;

        @NotBlank(message = "회원 이름은 공백이 아니어야 합니다")
        private String name;

        @NotBlank(message = "지역은 공백이 아니어야 합니다.")
        private String region;

        @NotBlank(message = "업종은 공백이 아니어야 합니다.")
        private String sector;

        public void setUserId(long userId) {
            this.userId = userId;
        }
    }

    @AllArgsConstructor
    @Getter
    public static class Response {
        private long userId;
        private String email;
        private String name;
    }
}
