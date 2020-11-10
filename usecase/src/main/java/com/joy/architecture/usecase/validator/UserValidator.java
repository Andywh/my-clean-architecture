package com.joy.architecture.usecase.validator;

import com.joy.architecture.domain.entity.User;
import com.joy.architecture.usecase.exception.UserValidationException;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class UserValidator {

    public static void validateCreateUser(final User user) {
        if (user == null) throw new UserValidationException("User should not be null");
        if (isBlank(user.getEmail())) throw new UserValidationException("Email should not be null");
        if (isBlank(user.getFirstName())) throw new UserValidationException("First name should not be null");
        if (isBlank(user.getLastName())) throw new UserValidationException("Last name should not be null");
    }

    private UserValidator() {

    }

    public static boolean isBlank(CharSequence cs) {
        int strLen = cs.length();
        if (strLen == 0) {
            return true;
        } else {
            for(int i = 0; i < strLen; ++i) {
                if (!Character.isWhitespace(cs.charAt(i))) {
                    return false;
                }
            }

            return true;
        }
    }

}
