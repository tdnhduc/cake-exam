package com.cake.origination.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DomainException extends BaseException {
    private String errorCode;
    private String reason;

    public DomainException(DomainCode domainCode) {
        this.errorCode = this.ERROR_FORMAT.formatted(domainCode.getErrorCode());
    }

    public DomainException(DomainCode domainCode, String reason) {
        this.errorCode = this.ERROR_FORMAT.formatted(domainCode.getErrorCode());
        this.reason = reason;
    }
}
