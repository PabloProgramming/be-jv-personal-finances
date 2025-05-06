package com.pablo_dev9.budgee_be.service.mapper;

import com.pablo_dev9.budgee_be.model.dto.UserReqDto;
import com.pablo_dev9.budgee_be.model.dto.UserResDto;
import com.pablo_dev9.budgee_be.model.entity.User;
import org.springframework.stereotype.Service;

@Service
public class UserMapper {

    public User reqDtoToUser(final UserReqDto userReqDto) {
        return User.builder()
                .username(userReqDto.getUsername())
                .password(userReqDto.getPassword())
                .email(userReqDto.getEmail())
                .avatarUrl(userReqDto.getAvatarUrl())
                .build();

    }

    public UserResDto userToResDto(final User user) {
        return UserResDto.builder()
                .id(user.getId())
                .username(user.getUsername())
                .email(user.getEmail())
                .avatarUrl(user.getAvatarUrl())
                .build();
    }

}
