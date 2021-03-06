package com.interfaces.exception;

import com.interfaces.exception.handler.ErrorCode;
import lombok.Getter;

@Getter
public class DuplicatedEntityException extends RuntimeException {

    private ErrorCode errorCode;

    public DuplicatedEntityException(final String errorMessage, ErrorCode errorCode) {
        super(errorMessage + "는 다른 사용자가 사용 중 입니다.");
        this.errorCode = errorCode;
    }
}
