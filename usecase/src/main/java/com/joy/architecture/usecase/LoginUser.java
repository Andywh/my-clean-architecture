package com.joy.architecture.usecase;

import com.joy.architecture.usecase.port.PasswordEncoder;
import com.joy.architecture.usecase.port.UserRepository;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class LoginUser {

    private final UserRepository userRepository;

    private final PasswordEncoder passwordEncoder;

    public LoginUser(final UserRepository userRepository, final PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }


}
