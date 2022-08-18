package com.codestates.soloproject.exception;

import lombok.Getter;

public class BusinessLogicException extends RuntimeException {
    @Getter
    private ExceptionCode exceptionCode;

    public BusinessLogicException(ExceptionCode exceptionCOde) {
        super(exceptionCOde.getMessage());
        this.exceptionCode = exceptionCOde;
    }
}
