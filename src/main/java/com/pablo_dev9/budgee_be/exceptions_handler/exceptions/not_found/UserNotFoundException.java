package com.pablo_dev9.budgee_be.exceptions_handler.exceptions.not_found;

public class UserNotFoundException extends RuntimeException {

    private static final String DESCRIPTION = "User Not Found with id: ";

    public UserNotFoundException(Long userId) {
        super(DESCRIPTION + userId);
    }
}
