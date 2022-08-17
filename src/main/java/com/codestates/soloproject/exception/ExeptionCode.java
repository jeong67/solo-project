package com.codestates.soloproject.exception;

import lombok.Getter;

public enum ExeptionCode {

    USER_NOT_FOUND(404, "User not found"),
    USER_EXISTS(409, "User exists");

    @Getter
    private int status;
    @Getter
    private String message;

    ExeptionCode(int code, String message) {
        this.status = code;
        this.message = message;
    }
}
