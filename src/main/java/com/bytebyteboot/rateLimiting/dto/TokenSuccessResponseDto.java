package com.bytebyteboot.rateLimiting.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class TokenSuccessResponseDto {
    private String accessToken;
}