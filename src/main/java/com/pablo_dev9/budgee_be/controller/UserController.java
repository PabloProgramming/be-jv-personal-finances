package com.pablo_dev9.budgee_be.controller;

import com.pablo_dev9.budgee_be.model.dto.UserReqDto;
import com.pablo_dev9.budgee_be.model.dto.UserResDto;
import com.pablo_dev9.budgee_be.service.UserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public UserResDto postUser(@Valid @RequestBody final UserReqDto userReqDto) {
        return userService.createUser(userReqDto);
    }

    @GetMapping("/{userId}")
    public UserResDto getUserById(@PathVariable final Long userId) {
        return userService.fetchUserById(userId);
    }
}

