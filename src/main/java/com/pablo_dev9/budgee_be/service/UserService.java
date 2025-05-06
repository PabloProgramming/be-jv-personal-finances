package com.pablo_dev9.budgee_be.service;

import com.pablo_dev9.budgee_be.exceptions_handler.exceptions.not_found.UserNotFoundException;
import com.pablo_dev9.budgee_be.model.dto.UserReqDto;
import com.pablo_dev9.budgee_be.model.dto.UserResDto;
import com.pablo_dev9.budgee_be.model.entity.User;
import com.pablo_dev9.budgee_be.repository.UserRepository;
import com.pablo_dev9.budgee_be.service.mapper.UserMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserResDto createUser(final UserReqDto userReqDto) {
        final User user = userMapper.reqDtoToUser(userReqDto);
        final User savedUser = userRepository.save(user);
        return userMapper.userToResDto(savedUser);
    }

    public UserResDto fetchUserById(final Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new UserNotFoundException(userId));
        return userMapper.userToResDto(user);
    }


}
