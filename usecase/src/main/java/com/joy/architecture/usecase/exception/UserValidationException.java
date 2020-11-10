package com.joy.architecture.usecase.exception;

import com.joy.architecture.domain.entity.User;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class UserValidationException extends RuntimeException {
    public UserValidationException(final String message) {
        super(message);
    }
}
