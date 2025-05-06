package com.pablo_dev9.budgee_be.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Builder
@Getter
@RequiredArgsConstructor
public class UserResDto {
    private final Long id;
    private final String username;
    private final String email;
    private final String avatarUrl;
}
