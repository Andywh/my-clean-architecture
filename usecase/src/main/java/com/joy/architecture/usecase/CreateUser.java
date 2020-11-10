package com.joy.architecture.usecase;

import com.joy.architecture.domain.entity.User;
import com.joy.architecture.usecase.exception.UserAlreadyExistsException;
import com.joy.architecture.usecase.port.IdGenerator;
import com.joy.architecture.usecase.port.PasswordEncoder;
import com.joy.architecture.usecase.port.UserRepository;
import com.joy.architecture.usecase.validator.UserValidator;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class CreateUser {

    private final UserRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final IdGenerator idGenerator;

    public CreateUser(final UserRepository repository, final PasswordEncoder passwordEncoder, final IdGenerator idGenerator) {
        this.repository = repository;
        this.passwordEncoder = passwordEncoder;
        this.idGenerator = idGenerator;
    }

    public User create(final User user) {
        UserValidator.validateCreateUser(user);
        if (repository.findByEmail(user.getEmail()).isPresent()) {
            throw new UserAlreadyExistsException(user.getEmail());
        }
        User userToSave = User.builder()
                .id(idGenerator.generate())
                .email(user.getEmail())
                .password(passwordEncoder.encode(user.getEmail() + user.getPassword()))
                .lastName(user.getLastName())
                .firstName(user.getFirstName())
                .build();
        return repository.create(userToSave);
    }

}
