package com.joy.architecture.config;

import com.joy.architecture.db.InMemoryUserRepository;
import com.joy.architecture.encoder.Sha256PasswordEncoder;
import com.joy.architecture.id.generator.uuid.UuidGenerator;
import com.joy.architecture.usecase.CreateUser;
import com.joy.architecture.usecase.FindUser;
import com.joy.architecture.usecase.LoginUser;
import com.joy.architecture.usecase.port.PasswordEncoder;
import com.joy.architecture.usecase.port.UserRepository;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class SpringConfig {
    private final UserRepository userRepository = new InMemoryUserRepository();
    private final PasswordEncoder passwordEncoder = new Sha256PasswordEncoder();

    public CreateUser createUser() {
        return new CreateUser(userRepository, passwordEncoder, new UuidGenerator());
    }

    public FindUser findUser() {
        return new FindUser(userRepository);
    }

    public LoginUser loginUser() {
        return new LoginUser(userRepository, passwordEncoder);
    }

}
