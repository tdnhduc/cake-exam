package com.cake.origination.exception;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public enum DomainCode {
    USER_EXISTED(1000),
    INVALID_REQUEST(1001);

    private final long errorCode;
    private final String reason = "%s";

    DomainCode(long errorCode) {
        this.errorCode = errorCode;
    }
}
