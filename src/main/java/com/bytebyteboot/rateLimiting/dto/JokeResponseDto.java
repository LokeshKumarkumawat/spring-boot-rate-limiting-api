package com.bytebyteboot.rateLimiting.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.extern.jackson.Jacksonized;

@Getter
@Builder
public class JokeResponseDto {

    private String joke;

}