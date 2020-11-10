package com.joy.architecture.usecase;

import com.joy.architecture.domain.entity.User;
import com.joy.architecture.usecase.port.UserRepository;

import java.util.List;
import java.util.Optional;

/**
 * @author Andy
 * @date 2020/11/10
 **/
public class FindUser {

    private final UserRepository repository;

    public FindUser(final UserRepository repository) {
        this.repository = repository;
    }

    public Optional<User> findById(final String id) {
        return repository.findById(id);
    }

    public List<User> findAllUsers() {
        return repository.findAllUsers();
    }

}
