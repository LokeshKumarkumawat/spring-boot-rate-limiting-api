package com.bytebyteboot.rateLimiting.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class UserCreationRequestDto {

    @NotBlank(message = "email-id must not be empty")
    @Email(message = "email-id must be of valid format")
    private String emailId;

    @NotBlank(message = "password must not be empty")
    private String password;

    @NotNull
    private UUID planId;

}