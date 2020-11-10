package com.joy.architecture.usecase;

import com.joy.architecture.usecase.exception.NotAllowedException;
import com.joy.architecture.usecase.port.PasswordEncoder;
import com.joy.architecture.usecase.port.UserRepository;
import com.joy.architecture.domain.entity.*;

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

    public User login(final String email, final String password) {
        User user = userRepository.findByEmail(email).orElseThrow(() -> new NotAllowedException("Not allowed"));
        String hashedPassword = passwordEncoder.encode(email + password);
        if (!user.getPassword().equals(hashedPassword)) throw new NotAllowedException("Not allowed");
        return user;
    }

}
