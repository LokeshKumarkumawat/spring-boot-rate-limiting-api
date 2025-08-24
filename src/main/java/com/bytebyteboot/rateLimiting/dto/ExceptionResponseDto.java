package com.bytebyteboot.rateLimiting.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ExceptionResponseDto<T> {
    private String status;
    private T description;
}