package com.joy.architecture.usecase.exception;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class UserAlreadyExistsException extends RuntimeException {
    public UserAlreadyExistsException(final String email) {
        super(email);
    }
}
