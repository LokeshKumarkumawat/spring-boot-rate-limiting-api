package com.bytebyteboot.rateLimiting.dto;


import lombok.Builder;
import lombok.Getter;

import java.util.UUID;

@Getter
@Builder
public class PlanResponseDto {
    private UUID id;
    private String name;
    private Integer limitPerHour;
}