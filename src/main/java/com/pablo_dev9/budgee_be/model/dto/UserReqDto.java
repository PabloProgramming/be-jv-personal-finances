package com.pablo_dev9.budgee_be.model.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class UserReqDto {
    @NotBlank
    @Size(min = 3, max = 50)
    private final String username;

    @NotBlank
    @Email
    private final String email;

    @NotBlank
    @Size(min = 6)
    private final String password;

    private final String avatarUrl;
}
