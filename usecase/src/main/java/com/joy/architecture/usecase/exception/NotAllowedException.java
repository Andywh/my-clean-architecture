package com.joy.architecture.usecase.exception;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class NotAllowedException extends RuntimeException {
    public NotAllowedException(final String message) {
        super(message);
    }
}
