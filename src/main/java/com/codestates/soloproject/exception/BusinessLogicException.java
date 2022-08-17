package com.codestates.soloproject.exception;

import lombok.Getter;

public class BusinessLogicException extends RuntimeException {
    @Getter
    private ExeptionCode exeptionCode;

    public BusinessLogicException(ExeptionCode exeptionCode) {
        super(exeptionCode.getMessage());
        this.exeptionCode = exeptionCode;
    }
}
